package com.progra.hangman.base;

public class Word {
    private int id;
    private String word;
    protected String level;
    protected int maxTries;

    public Word() {
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

    public int length() {
        return word.length();
    }
}
