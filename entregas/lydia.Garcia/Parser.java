package com.progra.Hangman.parsers;

import com.progra.Hangman.base.Word;
import com.progra.hangman.base.Word;
import com.progra.hangman.exceptions.InvalidWordException;

public interface Parser {
    public Word parse(String tokens) throws InvalidWordException;
}
