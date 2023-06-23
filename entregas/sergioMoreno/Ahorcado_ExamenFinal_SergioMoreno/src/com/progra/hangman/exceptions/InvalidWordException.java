package com.progra.hangman.exceptions;
import java.text.NumberFormat;

public class InvalidWordException extends Exception{
    public InvalidWordException(String message) {
        super(message);
    }

}
