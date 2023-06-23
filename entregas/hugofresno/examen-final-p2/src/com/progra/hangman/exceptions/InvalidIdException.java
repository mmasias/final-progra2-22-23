package com.progra.hangman.exceptions;

public class InvalidIdException extends NumberFormatException{

    public InvalidIdException(String msg){
        super("Tipo de error: "+msg);
    }}
