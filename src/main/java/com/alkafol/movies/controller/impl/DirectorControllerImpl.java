package com.alkafol.movies.controller.impl;

import com.alkafol.movies.controller.DirectorController;
import com.alkafol.movies.converter.DirectorConverter;
import com.alkafol.movies.dto.DirectorDto;
import com.alkafol.movies.entity.Director;
import com.alkafol.movies.service.DirectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DirectorControllerImpl implements DirectorController {
    private final DirectorService directorService;
    private final DirectorConverter directorConverter;

    @Autowired
    public DirectorControllerImpl(DirectorService directorService, DirectorConverter directorConverter) {
        this.directorService = directorService;
        this.directorConverter = directorConverter;
    }

    @Override
    public List<DirectorDto> findAll() {
        List<Director> directors = directorService.findAll();
        return directorConverter.convertToDirectorDto(directors);
    }

    @Override
    public DirectorDto findById(Long id) {
        Director director = directorService.findById(id);
        return directorConverter.convertToDirectorDto(List.of(director)).get(0);
    }

    @Override
    public DirectorDto create(DirectorDto directorDto) {
        Director director = directorConverter.convertToDirector(List.of(directorDto)).get(0);
        Director createdDirector = directorService.create(director);
        return directorConverter.convertToDirectorDto(List.of(createdDirector)).get(0);
    }

    @Override
    public DirectorDto update(Long id, DirectorDto directorDto) {
        Director director = directorConverter.convertToDirector(List.of(directorDto)).get(0);
        Director updatedDirector = directorService.update(id, director);
        return directorConverter.convertToDirectorDto(List.of(updatedDirector)).get(0);
    }

    @Override
    public void delete(Long id) {
        directorService.delete(id);
    }
}
