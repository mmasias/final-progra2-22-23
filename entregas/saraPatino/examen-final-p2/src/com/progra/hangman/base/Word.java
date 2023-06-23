package com.progra.hangman.base;

import com.progra.hangman.UserInterface;

public abstract class Word extends UserInterface {
    private int id;
    private String word;
    protected String level;
    protected int maxTries;


    public Word(int id, String word) {
        this.id = id;
        this.word = word;
        this.level = "ND";
        this.maxTries = 3;
    }

    public int getId() {
        return id;
    }

    public String getWord() {
        return word;
    }

    public int getLength() {
        return word.length();
    }

    public int getMaxTries() {
        return maxTries;
    }

    public String getLevel() {
        return level;
    }

    public void toUpperCase() {
        word = word.toUpperCase();
    }
}
