package com.progra.hangman.base;

public class MediumWord extends Word {
    String level;
    int maxTries;
    public MediumWord(int id, String word) {
        super(id, word);
        this.level = "M";
        this.maxTries = 2;
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
