package com.progra.hangman.exceptions;

public class InvalidIdException extends NumberFormatException {
    public InvalidIdException(String message) {
        super("ID not valid " + message);
    }
}
