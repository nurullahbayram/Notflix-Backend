package com.notflix.notflix.service;

import com.notflix.notflix.models.Movie;

import java.util.List;

public interface MovieService {
    List<Movie> getMovies();

    Movie createMovie(Movie movie);

    Movie updateMovie(Movie movie);
}
