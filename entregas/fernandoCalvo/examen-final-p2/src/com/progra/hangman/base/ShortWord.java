package com.progra.hangman.base;

public class ShortWord extends Word {

    public ShortWord(int id, String word) {
        super(id, word);
        this.level = "S";
    }
}
