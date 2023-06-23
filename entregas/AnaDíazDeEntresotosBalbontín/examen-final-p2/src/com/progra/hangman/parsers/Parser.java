package com.progra.hangman.parsers;

import com.progra.Exception.InvalidWordException;
import com.progra.hangman.base.Word;

    public interface Parser {
        public Word parse(String tokens) throws InvalidWordException;
    }

