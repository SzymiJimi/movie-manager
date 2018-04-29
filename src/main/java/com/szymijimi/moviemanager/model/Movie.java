package com.szymijimi.moviemanager.model;


import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Table(name="movie")

@Component
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String title;
    private String genre;
    private String production;
    private String premiere_date;
    private String director;
    private String description;

    public Movie() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    public String getPremiereDate() {
        return premiere_date;
    }

    public void setPremiereDate(String premiere_date) {
        this.premiere_date = premiere_date;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
