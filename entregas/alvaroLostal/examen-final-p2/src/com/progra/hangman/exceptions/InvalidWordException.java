package com.progra.hangman.exceptions;

public class InvalidWordException extends Throwable {
    public InvalidWordException (String message) {
        super("Invalid Word: " + message);
    }
}
