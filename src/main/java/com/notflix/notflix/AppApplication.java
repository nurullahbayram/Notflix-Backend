package com.notflix.notflix;

import com.notflix.notflix.models.AdminUser;
import com.notflix.notflix.models.Movie;
import com.notflix.notflix.repository.MovieRepository;
import com.notflix.notflix.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class AppApplication implements CommandLineRunner {
    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private UserService userService;

    public static void main(String[] args) {
        SpringApplication.run(AppApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        List<Movie> movieList = new ArrayList<>(Arrays.asList(
                new Movie(
                        1,
                        "Amelie",
                        "Romantic story",
                        "Love",
                        9,
                        "https://www.commonsensemedia.org/sites/default/files/styles/ratio_16_9_large/public/screenshots/csm-movie/amelie-still-0.jpg",
                        "https://www.youtube.com/embed/UkLkim0HYME"
                ),
                new Movie(
                        2,
                        "Batman Rises",
                        "Gotham",
                        "Fantastic",
                        10,
                        "https://cdn.britannica.com/49/127649-050-31417AF3/Heath-Ledger-Joker-Christian-Bale-The-Dark-Knight-2008.jpg",
                        "https://www.youtube.com/embed/XzGiNL3Mxrg"
                ),
                new Movie(
                        3,
                        "Hulk",
                        "Green Giant",
                        "Action",
                        8,
                        "https://thumbs.dreamstime.com/z/hulk-photo-taken-book-cover-82235584.jpg",
                        "https://www.youtube.com/embed/TWu-lNejFwg"
                ),
                new Movie(
                        4,
                        "SHERLOCK HOLMES",
                        "SHERLOCK HOLMES AND THE SHADOW WATCHERS - FULL HD THRILLER MOVIE IN ENGLISH",
                        "Action",
                        8,
                        "https://upload.wikimedia.org/wikipedia/en/e/e0/Sherlock_holmes_ver5.jpg",
                        "https://youtu.be/-9BrAodHbjQ"
                ),
                new Movie(
                        5,
                        "Spiderman",
                        "Spider-Man: No Way Home | Full Fan Movie (English)",
                        "Action",
                        8,
                        "https://m.media-amazon.com/images/M/MV5BZWMyYzFjYTYtNTRjYi00OGExLWE2YzgtOGRmYjAxZTU3NzBiXkEyXkFqcGdeQXVyMzQ0MzA0NTM@._V1_.jpg",
                        "https://youtu.be/S8ZUtWTuHT4"
                ),
                new Movie(
                        6,
                        "Parker",
                        "PARKER JASON STATHAM JENNİFER LOPEZ FUL ACTİON MOVİE",
                        "Action",
                        8,
                        "https://m.media-amazon.com/images/M/MV5BZGFmOGRhNjctNjZlMi00Yjc0LTkyYjUtMGM1Mjg2NzEzMmZiXkEyXkFqcGdeQXVyNTIzOTk5ODM@._V1_.jpg",
                        "https://youtu.be/ft5tnZIFyDo"
                ),
                new Movie(
                        7,
                        "Example Movie",
                        "Green Giant",
                        "Action",
                        8,
                        "https://img.moviepostershop.com/batman-movie-poster-1989-1010193890.jpg",
                        "https://www.youtube.com/embed/TWu-lNejFwg"
                ),
                new Movie(
                        8,
                        "Example Movie",
                        "Green Giant",
                        "Action",
                        8,
                        "https://thumbs.dreamstime.com/z/hulk-photo-taken-book-cover-82235584.jpg",
                        "https://www.youtube.com/embed/TWu-lNejFwg"
                )
        ));

        userService.create(new AdminUser(0,"Admin","password"));

        movieRepository.saveAll(movieList);

    }
}
