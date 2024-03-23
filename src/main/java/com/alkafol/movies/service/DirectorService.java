package com.alkafol.movies.service;

import com.alkafol.movies.entity.Director;

import java.util.List;

public interface DirectorService {
    Director findById(Long id);
    List<Director> findByIds(List<Long> ids);
    List<Director> findAll();
    Director update(Long id, Director director);
    Director create(Director director);
    void delete(Long id);
}
