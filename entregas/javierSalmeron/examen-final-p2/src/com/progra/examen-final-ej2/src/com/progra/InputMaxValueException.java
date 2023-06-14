package com.progra;

public class InputMaxValueException extends Exception {
    public InputMaxValueException() {
        super("InputMaxValueException - Max value allowed is 999");
    }

    public InputMaxValueException(String message) {
        super(message);
    }
}
