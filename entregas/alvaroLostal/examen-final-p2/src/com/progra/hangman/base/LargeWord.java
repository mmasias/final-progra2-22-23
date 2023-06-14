package com.progra.hangman.base;

public class LargeWord extends Word {
    public LargeWord(int id, String word) {
        super(id, word);
    }

    @Override
    public String getLevel() {
        return "L";
    }
}
