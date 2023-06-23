package com.progra.interfaces;

public class MessageException extends Throwable {
    public MessageException(String message) {
        super("Max value allowed is 999");
    }
}
