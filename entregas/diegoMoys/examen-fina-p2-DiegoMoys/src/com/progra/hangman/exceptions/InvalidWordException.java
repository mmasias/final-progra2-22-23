package com.progra.hangman.exceptions;

public class InvalidWordException extends Throwable {
    public InvalidWordException(String message) {
        System.out.println("" + message);
    }
}
