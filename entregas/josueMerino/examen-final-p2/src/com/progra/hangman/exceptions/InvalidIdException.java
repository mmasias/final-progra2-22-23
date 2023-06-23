package com.progra.hangman.exceptions;

public class InvalidIdException extends NumberFormatException {
    /**
     * Constructs a {@code NumberFormatException} with the
     * specified detail message.
     *
     * @param s the detail message.
     */
    public InvalidIdException(String s) {
        super(s);
    }
}
