package com.alkafol.movies.validator;

import com.alkafol.movies.dto.MovieDto;

public interface MovieValidator {
    Boolean validate(MovieDto movieDto);
}
