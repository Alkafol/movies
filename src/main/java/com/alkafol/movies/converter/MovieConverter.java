package com.alkafol.movies.converter;

import com.alkafol.movies.dto.MovieDto;
import com.alkafol.movies.entity.Movie;

import java.util.List;

public interface MovieConverter {
    List<Movie> convertToMovie(List<MovieDto> movieDtos);
    List<MovieDto> convertToMovieDto(List<Movie> movies);
}
