package com.progra.interfaces;

public class Exceptions extends Exception{

    public Exceptions() {
        super();
    }

    public void InputMaxValueException(int n) {
        if (n > 999) {
            throw new IllegalArgumentException("Max value allowed is 999");
        }

    }
}