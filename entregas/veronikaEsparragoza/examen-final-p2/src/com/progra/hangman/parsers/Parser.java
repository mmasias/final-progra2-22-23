package com.progra.hangman.parsers;

import com.progra.hangman.base.Word;
import com.progra.hangman.exceptions.InvalidIdException;
import com.progra.hangman.exceptions.InvalidWordException;

public interface Parser {
    public Word parse(String tokens) throws InvalidWordException, InvalidIdException;
}
