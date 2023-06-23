package com.progra.interfaces;

public class InputMaxValueException extends Exception{
    public InputMaxValueException(String msg){
        super("Error type: "+msg);
    }
}


