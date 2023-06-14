package com.progra.hangman.parsers;

import com.progra.hangman.base.Word;

public interface Parser {
    Word parse(String tokens) throws InvalidWordException;
}
