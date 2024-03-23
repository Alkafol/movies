package com.alkafol.movies.validator.impl;

import com.alkafol.movies.dto.DirectorDto;
import com.alkafol.movies.exception.DirectorValidationException;
import com.alkafol.movies.validator.DirectorValidator;
import org.springframework.stereotype.Component;

@Component
public class DirectorValidatorImpl implements DirectorValidator {
    @Override
    public void validate(DirectorDto directorDto) {
        if (directorDto.fullName().length() > 100) {
            throw new DirectorValidationException("Invalid year");
        }
    }
}
