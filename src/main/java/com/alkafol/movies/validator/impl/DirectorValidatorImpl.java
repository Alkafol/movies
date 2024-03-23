package com.alkafol.movies.validator.impl;

import com.alkafol.movies.dto.DirectorDto;
import com.alkafol.movies.validator.DirectorValidator;
import org.springframework.stereotype.Component;

@Component
public class DirectorValidatorImpl implements DirectorValidator {
    @Override
    public Boolean validate(DirectorDto directorDto) {
        if (directorDto.fullName().length() > 100) {
            return false;
        }

        return true;
    }
}
