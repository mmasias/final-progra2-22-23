package com.progra.interfaces;

public class InputMaxValueException extends Exception {
    public InputMaxValueException() {
        super(InputMaxValueException.class.getName() + " - " + "Max value allowed is 999");
    }

    public InputMaxValueException(String s) {
        super(InputMaxValueException.class.getName() + " - " + s);
    }
}
