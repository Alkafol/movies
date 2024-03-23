package com.alkafol.movies.service;

import com.alkafol.movies.entity.Movie;

import java.util.List;

public interface MovieService {
    Movie findById(Long id);
    List<Movie> findAll();
    Movie update(Long id, Movie movie);
    Movie create(Movie movie);
    void delete(Long id);
}
