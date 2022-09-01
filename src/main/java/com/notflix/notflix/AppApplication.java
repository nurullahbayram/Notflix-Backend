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
                        "https://www.google.com/search?q=amelie&rlz=1C1UEAD_enNL999__1000&sxsrf=ALiCzsZ19YjDcYVGQlekWEUwrXaxuez1SQ:1661953620518&source=lnms&tbm=isch&sa=X&ved=2ahUKEwjAmbzZm_H5AhUMxQIHHVwaCsQQ_AUoAXoECAIQAw&biw=1280&bih=609&dpr=1.5#imgrc=A7oUDZhhN2q5vM",
                        "https://www.youtube.com/embed/HUECWi5pX7o"
                ),
                new Movie(
                        2,
                        "Amelie",
                        "Romantic story",
                        "Love",
                        9,
                        "https://www.google.com/search?q=amelie&rlz=1C1UEAD_enNL999__1000&sxsrf=ALiCzsZ19YjDcYVGQlekWEUwrXaxuez1SQ:1661953620518&source=lnms&tbm=isch&sa=X&ved=2ahUKEwjAmbzZm_H5AhUMxQIHHVwaCsQQ_AUoAXoECAIQAw&biw=1280&bih=609&dpr=1.5#imgrc=A7oUDZhhN2q5vM",
                        "https://www.youtube.com/embed/HUECWi5pX7o"
                ),
                new Movie(
                        3,
                        "Amelie",
                        "Romantic story",
                        "Love",
                        9,
                        "https://www.google.com/search?q=amelie&rlz=1C1UEAD_enNL999__1000&sxsrf=ALiCzsZ19YjDcYVGQlekWEUwrXaxuez1SQ:1661953620518&source=lnms&tbm=isch&sa=X&ved=2ahUKEwjAmbzZm_H5AhUMxQIHHVwaCsQQ_AUoAXoECAIQAw&biw=1280&bih=609&dpr=1.5#imgrc=A7oUDZhhN2q5vM",
                        "https://www.youtube.com/embed/HUECWi5pX7o"
                )
        ));

        movieRepository.saveAll(movieList);

    }
}
