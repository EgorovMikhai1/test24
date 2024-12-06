package com.app.test24.exception;

public class UserDoesntExistException extends RuntimeException {
    public UserDoesntExistException(String message) {
        super(message);
    }
}
