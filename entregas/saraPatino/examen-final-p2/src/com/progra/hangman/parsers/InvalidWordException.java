package com.progra.hangman.parsers;

public class InvalidWordException extends Throwable {
    InvalidWordException(String text) {
        super(text);
    }
}
