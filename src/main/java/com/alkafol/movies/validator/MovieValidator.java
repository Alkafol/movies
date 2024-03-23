package com.alkafol.movies.validator;

import com.alkafol.movies.dto.MovieDto;

public interface MovieValidator {
    void validate(MovieDto movieDto);
}
