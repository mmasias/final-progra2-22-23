package com.progra.hangman.parsers;

import com.progra.hangman.base.Word;
import com.progra.hangman.Exceptions.InvalidWordException;

public interface Parser {
    public Word parse(String tokens) throws InvalidWordException;
}
