package com.szymijimi.moviemanager.controller;

import com.szymijimi.moviemanager.model.Movie;
import com.szymijimi.moviemanager.repository.MovieRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping(value="/api")
public class MovieController {

    private static final Logger LOGGER = LoggerFactory.getLogger(MovieController.class);

    @Autowired
    MovieRepository movieRepository;

    @RequestMapping(value="/movies", method = RequestMethod.GET)
    public ResponseEntity getMoviesList()
    {
        try{
            List<Movie> movies =  movieRepository.findAll();

            return ResponseEntity.status(HttpStatus.OK).body(movies);
        }catch(Exception e)
        {
            LOGGER.error("Error while searching for movies: "+ e.toString());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Nie znaleziono filmów...");
        }
    }

    @RequestMapping(value="/movie/{id}", method = RequestMethod.GET)
    public ResponseEntity getMovie(@PathVariable Integer id)
    {
        try{
            Optional<Movie> downloadedMovie =  movieRepository.findById(id);
            Movie movie = downloadedMovie.get();
            return ResponseEntity.status(HttpStatus.OK).body(movie);
        }catch(Exception e)
        {
            LOGGER.error("Error while searching for single movie: "+ e.toString());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Nie znaleziono danych na temat filmu...");
        }
    }

    @RequestMapping(value="/add", method = RequestMethod.POST)
    public ResponseEntity addMovie(@RequestBody Movie movie)
    {
        try{
            movieRepository.save(movie);
            return ResponseEntity.status(HttpStatus.OK).body("Zapisano pomyślnie");
        }catch(Exception e)
        {
            LOGGER.error("Error while searching for movies: "+ e.toString());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Nie zapisano pomyślnie");
        }
    }
}