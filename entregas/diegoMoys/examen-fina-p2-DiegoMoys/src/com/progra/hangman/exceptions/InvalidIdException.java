package com.progra.hangman.exceptions;

public class InvalidIdException extends Throwable{
    public InvalidIdException(String message) {
        System.out.println("Cannot create a word with less than 3 characters");
    }
}
