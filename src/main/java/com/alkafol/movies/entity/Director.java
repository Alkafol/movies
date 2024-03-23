package com.alkafol.movies.entity;

import jakarta.persistence.*;

@Entity(name = "director")
public class Director {
    @Id
    private Long id;

    @Column(name = "fullName")
    private String fullName;

    public Director(Long id, String fullName) {
        this.id = id;
        this.fullName = fullName;
    }

    public Director() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
