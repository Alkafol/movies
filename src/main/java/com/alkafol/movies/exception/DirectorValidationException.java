package com.alkafol.movies.exception;

public class DirectorValidationException extends RuntimeException {
    public DirectorValidationException(String errorMessage) {
        super(errorMessage);
    }
}
