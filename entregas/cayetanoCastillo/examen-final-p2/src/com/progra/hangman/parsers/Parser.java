package com.progra.hangman.parsers;

import com.progra.hangman.base.Word;

public interface Parser {
    public default Word parse(String tokens){
        return null;
    }
}
