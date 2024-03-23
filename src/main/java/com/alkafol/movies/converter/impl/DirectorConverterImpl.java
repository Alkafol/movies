package com.alkafol.movies.converter.impl;

import com.alkafol.movies.converter.DirectorConverter;
import com.alkafol.movies.dto.DirectorDto;
import com.alkafol.movies.entity.Director;
import com.alkafol.movies.validator.DirectorValidator;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DirectorConverterImpl implements DirectorConverter {
    private final DirectorValidator directorValidator;

    public DirectorConverterImpl(DirectorValidator directorValidator) {
        this.directorValidator = directorValidator;
    }

    @Override
    public List<Director> convertToDirector(List<DirectorDto> directorDtos) {
        return directorDtos.stream().map(directorDto -> {
            directorValidator.validate(directorDto);
            return new Director(
                            directorDto.id(),
                            directorDto.fullName()
                    );
                }
        ).toList();
    }

    @Override
    public List<DirectorDto> convertToDirectorDto(List<Director> directors) {
        return directors.stream().map(director -> new DirectorDto(
                        director.getId(),
                        director.getFullName()
                )
        ).toList();
    }
}
