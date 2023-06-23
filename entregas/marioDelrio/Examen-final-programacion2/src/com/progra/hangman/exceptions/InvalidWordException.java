package com.progra.hangman.exceptions;

public class InvalidWordException extends NumberFormatException{
    public InvalidWordException(String message) {
        super("Word not valid, " + message);
    }
}
