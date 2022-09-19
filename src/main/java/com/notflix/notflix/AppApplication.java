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
                        "https://upload.wikimedia.org/wikipedia/en/5/53/Amelie_poster.jpg",
                        "https://www.youtube.com/embed/UkLkim0HYME"
                ),
                new Movie(
                        2,
                        "Batman Rises",
                        "Gotham",
                        "Fantastic",
                        10,
                        "https://m.media-amazon.com/images/W/WEBP_402378-T2/images/I/81Bivc7COzL._AC_SL1500_.jpg",
                        "https://www.youtube.com/embed/XzGiNL3Mxrg"
                ),
                new Movie(
                        3,
                        "Hulk",
                        "Green Giant",
                        "Action",
                        8,
                        "https://m.media-amazon.com/images/W/WEBP_402378-T2/images/I/61ikONHVOAL._AC_SL1096_.jpg",
                        "https://www.youtube.com/embed/TWu-lNejFwg"
                ),
                new Movie(
                        4,
                        "Toy Story",
                        "Synopsis. Set in a world where toys come alive, the world s first computer-animated movie focuses on the toys of Andy Davis.",
                        "Cartoon",
                        8,
                        "https://images-na.ssl-images-amazon.com/images/M/MV5BMDU2ZWJlMjktMTRhMy00ZTA5LWEzNDgtYmNmZTEwZTViZWJkXkEyXkFqcGdeQXVyNDQ2OTk4MzI@..jpg",
                        "https://www.youtube.com/embed/9pn8utbTtnU"
                ),
                new Movie(
                        5,
                        "007 Golden Eye",
                        "When a powerful satellite system goes missing, James Bond (Pierce Brosnan) is the only one who can stop those behind it.",
                        "Action",
                        8,
                        "https://images-na.ssl-images-amazon.com/images/M/MV5BMzk2OTg4MTk1NF5BMl5BanBnXkFtZTcwNjExNTgzNA@@..jpg",
                        "https://www.youtube.com/embed/rxWkLdgdcPA"
                ),
                new Movie(
                        6,
                        "Four Rooms",
                        "This anthology film with four stories set in a fading hotel and one character in common is a mixed bag, with one hilarious segment.",
                        "Comedy",
                        8,
                        "https://images-na.ssl-images-amazon.com/images/M/MV5BNDc3Y2YwMjUtYzlkMi00MTljLTg1ZGMtYzUwODljZTI1OTZjXkEyXkFqcGdeQXVyMTQxNzMzNDI@..jpg",
                        "https://www.youtube.com/embed/QNd2ug4gvzM"
                ),
                new Movie(
                        7,
                        "Get Shorty",
                        "A mobster travels to Hollywood to collect a debt, and discovers that the movie business is much the same as his current job.",
                        "Comedy",
                        8,
                        "https://images-na.ssl-images-amazon.com/images/M/MV5BMjAwODYzNDY4Ml5BMl5BanBnXkFtZTcwODkwNTgzNA@@..jpg",
                        "https://www.youtube.com/embed/rh8OdlSXiDo"
                ),
                new Movie(
                        8,
                        "Batman Rises",
                        "Gotham",
                        "Fantastic",
                        10,
                        "https://m.media-amazon.com/images/W/WEBP_402378-T2/images/I/81Bivc7COzL._AC_SL1500_.jpg",
                        "https://www.youtube.com/embed/XzGiNL3Mxrg"
                ),
                new Movie(
                        9,
                        "Hulk",
                        "Green Giant",
                        "Action",
                        8,
                        "https://m.media-amazon.com/images/W/WEBP_402378-T2/images/I/61ikONHVOAL._AC_SL1096_.jpg",
                        "https://www.youtube.com/embed/TWu-lNejFwg"
                ),
                new Movie(
                        10,
                        "Toy Story",
                        "Synopsis. Set in a world where toys come alive, the world s first computer-animated movie focuses on the toys of Andy Davis.",
                        "Cartoon",
                        8,
                        "https://images-na.ssl-images-amazon.com/images/M/MV5BMDU2ZWJlMjktMTRhMy00ZTA5LWEzNDgtYmNmZTEwZTViZWJkXkEyXkFqcGdeQXVyNDQ2OTk4MzI@..jpg",
                        "https://www.youtube.com/embed/9pn8utbTtnU"
                ),
                new Movie(
                        11,
                        "007 Golden Eye",
                        "When a powerful satellite system goes missing, James Bond (Pierce Brosnan) is the only one who can stop those behind it.",
                        "Action",
                        8,
                        "https://images-na.ssl-images-amazon.com/images/M/MV5BMzk2OTg4MTk1NF5BMl5BanBnXkFtZTcwNjExNTgzNA@@..jpg",
                        "https://www.youtube.com/embed/rxWkLdgdcPA"
                ),
                new Movie(
                        12,
                        "Four Rooms",
                        "This anthology film with four stories set in a fading hotel and one character in common is a mixed bag, with one hilarious segment.",
                        "Comedy",
                        8,
                        "https://images-na.ssl-images-amazon.com/images/M/MV5BNDc3Y2YwMjUtYzlkMi00MTljLTg1ZGMtYzUwODljZTI1OTZjXkEyXkFqcGdeQXVyMTQxNzMzNDI@..jpg",
                        "https://www.youtube.com/embed/QNd2ug4gvzM"
                )
        ));

        userService.create(new AdminUser(0,"Admin","password"));

        movieRepository.saveAll(movieList);

    }
}
