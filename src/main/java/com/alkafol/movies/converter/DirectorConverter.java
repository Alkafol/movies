package com.alkafol.movies.converter;

import com.alkafol.movies.dto.DirectorDto;
import com.alkafol.movies.entity.Director;

import java.util.List;

public interface DirectorConverter {
    List<Director> convertToDirector(List<DirectorDto> directorDtos);
    List<DirectorDto> convertToDirectorDto(List<Director> directors);
}
