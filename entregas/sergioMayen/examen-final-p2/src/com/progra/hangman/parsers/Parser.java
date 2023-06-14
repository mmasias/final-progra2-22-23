package com.progra.hangman.parsers;

public interface Parser {
    public void parse(String tokens) throws InvalidWordException;
}
