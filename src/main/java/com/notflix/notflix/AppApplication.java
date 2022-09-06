package com.notflix.notflix;

import com.notflix.notflix.models.Movie;
import com.notflix.notflix.repository.MovieRepository;
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
                )
        ));

        movieRepository.saveAll(movieList);

    }
}
