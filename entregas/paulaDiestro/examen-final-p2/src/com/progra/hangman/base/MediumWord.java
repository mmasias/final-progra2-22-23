package com.progra.hangman.base;

public class MediumWord extends Word{
    public MediumWord(int id, String word) {
        super(id, word);
    }
    String level = "M";
    @Override
    public String getLevel() {
        return level;
    }
}
