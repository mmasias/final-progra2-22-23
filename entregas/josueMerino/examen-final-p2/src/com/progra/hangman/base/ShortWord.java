package com.progra.hangman.base;

public class ShortWord extends Word {
    public ShortWord(int code, String word) {
        super(code, word);
        this.level = "S";
    }
}
