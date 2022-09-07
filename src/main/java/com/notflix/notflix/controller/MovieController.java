package com.notflix.notflix.controller;

import com.notflix.notflix.models.Movie;
import com.notflix.notflix.service.MovieServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/movie")
public class MovieController {
    @Autowired
    private MovieServiceImpl movieServiceImpl;

    //http://localhost:8090/api/movie/all
    @GetMapping("/all")
    @ResponseBody
    public List<Movie> getMovies() {return movieServiceImpl.getMovies();}

    //http://localhost:8090/api/movie/all/{id}
    @GetMapping(value = {"/all/{id}"})
    @ResponseBody
    public Movie getEmployeesByIdWithRequired(@PathVariable int id) {
        List<Movie> movies = movieServiceImpl.getMovies().stream().filter(x -> x.getId() == id).toList();
        return movies.get(0);
    }


    @PostMapping("/add")
    public Movie createMovie(@RequestBody Movie movie) {
        return movieServiceImpl.createMovie(movie);
    }

    @PutMapping()
    public Movie updateMovie(@RequestBody Movie movie) {
        return movieServiceImpl.updateMovie(movie);
    }
}


