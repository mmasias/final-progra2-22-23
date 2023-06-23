package com.progra.hangman.exceptions;

public class InvalidIdException extends Throwable {
    public InvalidIdException(String message) {
        super("Invalid Id: " + message);
    }
}
