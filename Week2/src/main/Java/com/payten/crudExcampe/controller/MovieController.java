package com.payten.crudExcampe.controller;

import com.payten.crudExcampe.model.Movie;
import com.payten.crudExcampe.service.MovieService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Api(value = "Movie Controller API Documents")
@RestController
@RequestMapping("/api/movie")
public class MovieController {

    @Autowired //Injected service layer
    @ApiModelProperty(value = "injected service for operation")
    private MovieService service;

    /**
     * Api test icin resources altında postman collection var
     */

    //Return type is ResponseEntity for set status easy
    @GetMapping("/getMovies")
    @ApiOperation(value = "Get all movies api.")
    public ResponseEntity<Movie> getMovies() {
        return service.getMovies();
    }

    @GetMapping("/getMovie/{id}")
    @ApiOperation(value = "get movie by id operation")
    public ResponseEntity<Movie> getMovieById(@PathVariable Long id) {
        return service.getMovieById(id);
    }

    @PostMapping("/createMovie")
    @ApiOperation(value = "create movie operation")
    public ResponseEntity<Movie> createMovie(@RequestBody Movie movie) {
        return service.createMovie(movie);
    }

    @DeleteMapping("/deleteMovie/{id}")
    @ApiOperation(value = "delete movie by id operation")
    public ResponseEntity deleteMovie(@PathVariable Long id) {
        return service.deleteMovie(id);
    }

}
