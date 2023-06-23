package com.progra.interfaces;

public class DivisorException extends Exception {
    public DivisorException() {
        super("El número debe ser como máximo 999.");
    }
    public DivisorException(String message) {
        super(message);
    }
}