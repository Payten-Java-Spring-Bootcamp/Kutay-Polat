package com.payten.crudExcampe.service;

import com.payten.crudExcampe.conf.FirstSetupConfig;
import com.payten.crudExcampe.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MovieService {

    @Autowired
    private FirstSetupConfig listConfig;

    public ResponseEntity<Movie> getMovies() {
        return new ResponseEntity(listConfig.getMovies(), HttpStatus.OK);
    }

    public ResponseEntity<Movie> getMovieById(Long id) {
        if (StringUtils.isEmpty(id)) {
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
        List<Movie> movie = listConfig.getMovies().stream().filter(mv -> {
            return mv.getId() == id;
        }).collect(Collectors.toList());
        if (movie.size() == 0) {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity(movie.get(0), HttpStatus.OK);
        }
    }

    public ResponseEntity<Movie> createMovie(Movie movie) {

        Movie createdMovie = Movie.builder()
                .id(movie.getId())
                .name(movie.getName())
                .genre(movie.getGenre())
                .releaseYear(movie.getReleaseYear())
                .director(movie.getDirector())
                .cast(movie.getCast())
                .build();

        return new ResponseEntity(createdMovie, HttpStatus.CREATED);
    }

    public ResponseEntity deleteMovie(Long id) {
        listConfig.getMovies().removeIf(movies -> movies.getId().equals(id));
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
    }


}
