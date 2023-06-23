package com.progra.interfaces;
import java.lang.*;

public class Exceptions extends Exception{

    public Exceptions() {
        super();
    }

    public void InputMaxValueException(int n) {
        if (n > 999) {
            throw new IllegalArgumentException("Max value is 999");
        }

    }
}
