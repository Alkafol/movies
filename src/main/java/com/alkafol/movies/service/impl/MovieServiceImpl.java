package com.alkafol.movies.service.impl;

import com.alkafol.movies.dao.MovieRepository;
import com.alkafol.movies.entity.Movie;
import com.alkafol.movies.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {
    private final MovieRepository movieRepository;

    @Autowired
    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public Movie findById(Long id) {
       return movieRepository.findById(id).orElseThrow();
    }

    @Override
    public List<Movie> findAll() {
        return movieRepository.findAll();
    }

    @Override
    public Movie update(Long id, Movie movie) {
        if (!id.equals(movie.getId())) {
            throw new IllegalStateException();
        }
        return movieRepository.save(movie);
    }

    @Override
    public Movie create(Movie movie) {
        return movieRepository.save(movie);
    }

    @Override
    public void delete(Long id) {
        movieRepository.deleteById(id);
    }
}
