package com.alkafol.movies.entity;

import jakarta.persistence.*;

import java.time.LocalTime;

@Entity(name = "movie")
public class Movie {
    @Id
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "year")
    private Long year;

    @ManyToOne
    @JoinColumn(name = "movie_id")
    private Director director;

    @Column(name = "length")
    private LocalTime length;

    @Column(name = "rating")
    private Integer rating;

    public Movie(Long id, String title, Long year, Director director, LocalTime length, Integer rating) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.director = director;
        this.length = length;
        this.rating = rating;
    }

    public Movie() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getYear() {
        return year;
    }

    public void setYear(Long year) {
        this.year = year;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public LocalTime getLength() {
        return length;
    }

    public void setLength(LocalTime length) {
        this.length = length;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }
}
