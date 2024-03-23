package com.alkafol.movies.validator.impl;

import com.alkafol.movies.dto.MovieDto;
import com.alkafol.movies.exception.MovieValidationException;
import com.alkafol.movies.validator.MovieValidator;
import org.springframework.stereotype.Component;

@Component
public class MovieValidatorImpl implements MovieValidator {
    @Override
    public void validate(MovieDto movieDto) {
        if (movieDto.rating() > 10 || movieDto.rating() < 0) {
            throw new MovieValidationException("Invalid rating");
        }
        if (movieDto.title().length() > 100) {
            throw new MovieValidationException("Invalid title length");
        }
        if (movieDto.year() > 2100 || movieDto.year() < 1900) {
            throw new MovieValidationException("Invalid year");
        }
    }
}
