package com.progra.interfaces.exceptions;

public class InvalidNumException extends Exception {
    public InvalidNumException(String message) {
        super(message);
    }

    public InvalidNumException(){
        super("Defect message, problem with numbers");
    }
}
