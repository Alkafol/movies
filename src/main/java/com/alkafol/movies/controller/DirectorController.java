package com.alkafol.movies.controller;

import com.alkafol.movies.dto.DirectorDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api")
public interface DirectorController {
    @GetMapping("/directors")
    List<DirectorDto> findAll();

    @GetMapping("/directors/{id}")
    DirectorDto findById(@PathVariable Long id);

    @PostMapping("/directors")
    DirectorDto create(@RequestBody DirectorDto directorDto);

    @PatchMapping("/directors/{id}")
    DirectorDto update(@PathVariable Long id, @RequestBody DirectorDto directorDto);

    @DeleteMapping("/directors/{id}")
    void delete(@PathVariable Long id);
}
