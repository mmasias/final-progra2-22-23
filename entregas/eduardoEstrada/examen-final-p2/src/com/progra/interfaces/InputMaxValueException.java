package com.progra.interfaces;

public class InputMaxValueException extends Exception{
    public InputMaxValueException(String message){
        super(message);
    }

    public InputMaxValueException(){
        super("InputMaxValueException - Max value allowed is 999");
    }
    
}
