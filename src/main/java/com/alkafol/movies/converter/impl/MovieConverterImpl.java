package com.alkafol.movies.converter.impl;

import com.alkafol.movies.converter.MovieConverter;
import com.alkafol.movies.dto.MovieDto;
import com.alkafol.movies.entity.Director;
import com.alkafol.movies.entity.Movie;
import com.alkafol.movies.service.DirectorService;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Component
public class MovieConverterImpl implements MovieConverter {
    private final DirectorService directorService;

    public MovieConverterImpl(DirectorService directorService) {
        this.directorService = directorService;
    }

    @Override
    public List<Movie> convertToMovie(List<MovieDto> movieDtos) {
        List<Long> directorsId = movieDtos.stream().map(MovieDto::id).toList();
        Map<Long, Director> directors = directorService.findByIds(directorsId).stream().collect(
                Collectors.toMap(Director::getId, Function.identity())
        );

        return movieDtos.stream().map(
                movieDto -> new Movie(
                        movieDto.id(),
                        movieDto.title(),
                        movieDto.year(),
                        directors.get(movieDto.director()),
                        movieDto.length(),
                        movieDto.rating()
                )
        ).toList();
    }

    @Override
    public List<MovieDto> convertToMovieDto(List<Movie> movies) {
        return movies.stream().map(
                movie -> new MovieDto(
                        movie.getId(),
                        movie.getTitle(),
                        movie.getYear(),
                        movie.getDirector().getId(),
                        movie.getLength(),
                        movie.getRating()
                )
        ).toList();
    }
}
