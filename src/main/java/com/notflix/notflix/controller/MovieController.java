package com.notflix.notflix.controller;

import com.notflix.notflix.models.Movie;
import com.notflix.notflix.service.MovieServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("*")
@RestController
@RequestMapping("/api/movie")
public class MovieController {
    @Autowired
    private MovieServiceImpl movieServiceImpl;

    @GetMapping("/all")
    public List<Movie> getMovies(){
        return movieServiceImpl.getMovies();
    }

    @PostMapping("/add")
    public Movie createMovie(@RequestBody Movie movie){
        return movieServiceImpl.createMovie(movie);
    }

    @PutMapping()
    public Movie updateMovie(@RequestBody Movie movie){
        return movieServiceImpl.updateMovie(movie);
    }
}
