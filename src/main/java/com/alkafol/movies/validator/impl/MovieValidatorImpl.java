package com.alkafol.movies.validator.impl;

import com.alkafol.movies.dto.MovieDto;
import com.alkafol.movies.validator.MovieValidator;
import org.springframework.stereotype.Component;

@Component
public class MovieValidatorImpl implements MovieValidator {
    @Override
    public Boolean validate(MovieDto movieDto) {
        if (movieDto.rating() > 10 || movieDto.rating() < 0) {
            return false;
        }
        if (movieDto.title().length() > 100) {
            return false;
        }
        if (movieDto.year() > 2100 || movieDto.year() < 1900) {
            return false;
        }

        return true;
    }
}
