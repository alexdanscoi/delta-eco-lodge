package com.example.deltaecolodge.exception;

public class InternalServerException extends RuntimeException {
    public InternalServerException(String errorMessage) {
        super(errorMessage);

    }
}
