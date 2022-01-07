package com.payten.crudExcampe.conf;

import com.payten.crudExcampe.model.Genre;
import com.payten.crudExcampe.model.Member;
import com.payten.crudExcampe.model.Movie;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class FirstSetupConfig implements ApplicationListener<ContextRefreshedEvent> {
    private final List<Movie> movies = new ArrayList<>();
    private final List<Member> members = new ArrayList<>();

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        movies.add(Movie.builder().id(1L).name("Don't Look up").genre(Genre.DRAMA).releaseYear("2021").director("Adam McKay").cast(List.of("Leonardo DiCaprio","Jennifer Lawrence","Meryl Streep")).build());
        movies.add(Movie.builder().id(2L).name("Old").genre(Genre.HORROR).releaseYear("2021").director("M. Night Shyamalan").cast(List.of("Gael García Bernal","Vicky Krieps","Rufus Sewell")).build());
        movies.add(Movie.builder().id(3L).name("Another Round").genre(Genre.COMEDY).releaseYear("2020").director("Thomas Vinterberg").cast(List.of("Mads Mikkelsen","Thomas Bo Larsen","Magnus Millang")).build());

        members.add(Member.builder().id(1L).name("Kutay Polat").phone("+905553331122").watchlist(null).build());
        members.add(Member.builder().id(2L).name("Payten Bootcamp").phone("+905553331122").watchlist(null).build());
        members.add(Member.builder().id(3L).name("Patika").phone("+905553331122").watchlist(null).build());
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public List<Member> getMembers() {
        return members;
    }
}
