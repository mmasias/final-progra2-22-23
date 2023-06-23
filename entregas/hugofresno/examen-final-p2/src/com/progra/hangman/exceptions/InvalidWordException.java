package com.progra.hangman.exceptions;

public class InvalidWordException extends Exception{

    public InvalidWordException(String msg){
        super("Tipo de error: "+msg);
    }

}
