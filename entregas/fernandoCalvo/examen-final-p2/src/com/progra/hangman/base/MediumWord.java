package com.progra.hangman.base;

public class MediumWord extends Word {

    public MediumWord(int id, String word) {
        super(id, word);
        this.level = "M";
        this.maxTries = 8;
    }
}