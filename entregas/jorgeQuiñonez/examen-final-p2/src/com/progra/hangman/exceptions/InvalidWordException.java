package com.progra.hangman.exceptions;

import java.lang.Exception;

public class InvalidWordException extends Exception {

    public InvalidWordException(String message) {
        super(message);
    }

}
