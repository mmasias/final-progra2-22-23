package com.progra.hangman.base;

public class ShortWord extends Word {

    public ShortWord(int id, String word) {
        super(id, word);
    }

    @Override
    public String getLevel() {
        return "S";
    }
}
