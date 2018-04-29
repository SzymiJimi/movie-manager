package com.szymijimi.moviemanager.repository;

import com.szymijimi.moviemanager.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface MovieRepository extends JpaRepository<Movie, Integer> {


}
