package com.alkafol.movies.service.impl;

import com.alkafol.movies.dao.DirectorRepository;
import com.alkafol.movies.entity.Director;
import com.alkafol.movies.service.DirectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DirectorServiceImpl implements DirectorService {
    private final DirectorRepository directorRepository;

    @Autowired
    public DirectorServiceImpl(DirectorRepository directorRepository) {
        this.directorRepository = directorRepository;
    }

    @Override
    public Director findById(Long id) {
        return directorRepository.findById(id).orElseThrow();
    }

    @Override
    public List<Director> findByIds(List<Long> ids) {
        return directorRepository.findAllById(ids);
    }

    @Override
    public List<Director> findAll() {
        return directorRepository.findAll();
    }

    @Override
    public Director update(Long id, Director director) {
        if (!id.equals(director.getId())) {
            throw new IllegalStateException();
        }
        return directorRepository.save(director);
    }

    @Override
    public Director create(Director director) {
        return directorRepository.save(director);
    }

    @Override
    public void delete(Long id) {
        directorRepository.deleteById(id);
    }
}
