package com.notflix.notflix.service;

import com.notflix.notflix.models.Movie;
import com.notflix.notflix.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {
    @Autowired
    private MovieRepository movieRepository;


    @Override
    public List<Movie> getMovies() {
        return (List<Movie>) movieRepository.findAll();
    }

    @Override
    public Movie createMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    @Override
    public Movie updateMovie(Movie movie) {
        System.out.println("movie = " + movie);
        return movieRepository.save(movie);
    }
}
