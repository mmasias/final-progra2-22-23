package com.progra.hangman.base;

public class LargeWord extends Word{
    public LargeWord(int id, String word) {
        super(id, word);
        this.level = "A";
        this.maxTries = 5;
    }
}
