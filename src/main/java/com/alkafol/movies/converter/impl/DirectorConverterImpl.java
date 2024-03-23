package com.alkafol.movies.converter.impl;

import com.alkafol.movies.converter.DirectorConverter;
import com.alkafol.movies.dto.DirectorDto;
import com.alkafol.movies.entity.Director;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DirectorConverterImpl implements DirectorConverter {
    @Override
    public List<Director> convertToDirector(List<DirectorDto> directorDtos) {
        return directorDtos.stream().map(directorDto -> new Director(
                        directorDto.id(),
                        directorDto.fullName()
                )
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
