package com.alkafol.movies.controller;

import com.alkafol.movies.dto.MovieDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api")
public interface MovieController {
    @GetMapping("/movies")
    List<MovieDto> findAll();

    @GetMapping("/movies/{id}")
    MovieDto findById(@PathVariable Long id);

    @PostMapping("/movies")
    MovieDto create(@RequestBody MovieDto movieDto);

    @PatchMapping("/movies/{id}")
    MovieDto update(@PathVariable Long id, @RequestBody MovieDto movieDto);

    @DeleteMapping("/movies/{id}")
    void delete(@PathVariable Long id);
}
