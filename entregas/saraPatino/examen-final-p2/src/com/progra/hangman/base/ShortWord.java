package com.progra.hangman.base;

public class ShortWord extends Word {
    String level;
    int maxTries;
    public ShortWord(int id, String word) {
        super(id, word);
        this.level = "S";
        this.maxTries= 1;
    }

    @Override
    public int getMaxTries() {
        return maxTries;
    }

    @Override
    public String getLevel() {
        return level;
    }
}
