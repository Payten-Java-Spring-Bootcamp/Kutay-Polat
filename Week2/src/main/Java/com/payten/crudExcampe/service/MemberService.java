package com.payten.crudExcampe.service;

import com.payten.crudExcampe.conf.FirstSetupConfig;
import com.payten.crudExcampe.model.Member;
import com.payten.crudExcampe.model.MoviePoint;
import com.payten.crudExcampe.model.Watchlist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Optional;

@Service
public class MemberService {

    @Autowired
    private FirstSetupConfig listConfig;

    public ResponseEntity<Member> createWatchList(Watchlist watchlist) {
        if(!StringUtils.isEmpty(watchlist.getMemberId())) {
            Optional<Member> member = listConfig.getMembers().stream().filter(mbr -> mbr.getId() == watchlist.getMemberId()).findFirst();

            if (member.isPresent()) {
                Watchlist createdWatchList = Watchlist.builder().id(watchlist.getId()).memberId(watchlist.getMemberId()).watchListName(watchlist.getWatchListName()).movies(null).build();
                return new ResponseEntity(createdWatchList, HttpStatus.OK);
            } else {
                return new ResponseEntity("Member can't find. Please subscribe first!", HttpStatus.NOT_FOUND);
            }
        }
        return new ResponseEntity(HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<Member> giveStarsMovie(MoviePoint moviePoint) {
        if(!StringUtils.isEmpty(moviePoint.getMemberId())) {
            Optional<Member> member = listConfig.getMembers().stream().filter(mbr -> mbr.getId() == moviePoint.getMemberId()).findFirst();

            if (member.isPresent()) {
                MoviePoint createdMoviePoint = MoviePoint.builder().memberId(moviePoint.getMemberId()).movieId(moviePoint.getMovieId()).point(moviePoint.getPoint()).build();
                return new ResponseEntity(createdMoviePoint, HttpStatus.OK);
            } else {
                return new ResponseEntity("Member can't find. Please subscribe first!", HttpStatus.NOT_FOUND);
            }
        }
        return new ResponseEntity(HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<Member> watchListAddMovie(Watchlist watchlist) {
        if(!StringUtils.isEmpty(watchlist.getMemberId())) {
            Optional<Member> member = listConfig.getMembers().stream().filter(mbr -> mbr.getId() == watchlist.getMemberId()).findFirst();

            if (member.isPresent()) {
                Watchlist createdWatchList = Watchlist.builder().id(watchlist.getId()).memberId(watchlist.getMemberId()).watchListName(watchlist.getWatchListName()).movies(watchlist.getMovies()).build();
                return new ResponseEntity(createdWatchList, HttpStatus.OK);
            } else {
                return new ResponseEntity("Member can't find. Please subscribe first!", HttpStatus.NOT_FOUND);
            }
        }
        return new ResponseEntity(HttpStatus.BAD_REQUEST);
    }
}
