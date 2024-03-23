package com.alkafol.movies.controller.impl;

import com.alkafol.movies.controller.MovieController;
import com.alkafol.movies.converter.MovieConverter;
import com.alkafol.movies.dto.MovieDto;
import com.alkafol.movies.entity.Movie;
import com.alkafol.movies.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieControllerImpl implements MovieController {
    private final MovieConverter movieConverter;
    private final MovieService movieService;

    @Autowired
    public MovieControllerImpl(MovieConverter movieConverter, MovieService movieService) {
        this.movieConverter = movieConverter;
        this.movieService = movieService;
    }

    @Override
    public List<MovieDto> findAll() {
        List<Movie> movies = movieService.findAll();
        return movieConverter.convertToMovieDto(movies);
    }

    @Override
    public MovieDto findById(Long id) {
        Movie movie = movieService.findById(id);
        return movieConverter.convertToMovieDto(List.of(movie)).get(0);
    }

    @Override
    public MovieDto create(MovieDto movieDto) {
        Movie movie = movieConverter.convertToMovie(List.of(movieDto)).get(0);
        Movie createdMovie = movieService.create(movie);
        return movieConverter.convertToMovieDto(List.of(createdMovie)).get(0);
    }

    @Override
    public MovieDto update(Long id, MovieDto movieDto) {
        Movie movie = movieConverter.convertToMovie(List.of(movieDto)).get(0);
        Movie updatedMovie = movieService.update(id, movie);
        return movieConverter.convertToMovieDto(List.of(updatedMovie)).get(0);
    }

    @Override
    public void delete(Long id) {
        movieService.delete(id);
    }
}
