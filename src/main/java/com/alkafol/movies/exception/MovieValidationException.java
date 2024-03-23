package com.alkafol.movies.exception;

public class MovieValidationException extends RuntimeException {
    public MovieValidationException(String errorMessage) {
        super(errorMessage);
    }
}
