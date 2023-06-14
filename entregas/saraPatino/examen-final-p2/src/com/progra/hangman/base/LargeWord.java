package com.progra.hangman.base;

public class LargeWord extends Word {
    String level;
    int maxTries;
    public LargeWord(int id, String word) {
        super(id, word);
        this.level = "L";
        this.maxTries = 3;
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
