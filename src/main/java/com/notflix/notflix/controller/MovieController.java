package com.notflix.notflix.controller;

import com.notflix.notflix.models.Movie;
import com.notflix.notflix.service.MovieServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
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
    public List<Movie> getMovies(@RequestParam(required = false) String id){
        //http://localhost:8090/api/movie/all?id=
        if(id!=null){
           return movieServiceImpl.getMovies().stream().filter(x->x.getId()==Integer.valueOf(id)).toList();
        }
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
