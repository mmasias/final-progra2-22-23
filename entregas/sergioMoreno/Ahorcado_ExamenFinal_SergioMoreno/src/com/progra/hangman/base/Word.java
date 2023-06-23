package com.progra.hangman.base;

public abstract class Word {

    int id;
    String word;
    String level;
    int maxTries;

    public Word(int id, String word, String level, int maxTries) {
        this.id = id;
        this.word = word;
        this.level = level;
        this.maxTries = maxTries;
    }

    int getId() {
        return id;
    }
    String getWord() {
        return word;
    }
    int GetLength() {
        return word.length();
    }
    int getMaxTries() {
        return maxTries;
    }
    String getLevel() {
        return level;
    }
    void toUpperCase() {
        word = word.toUpperCase();
    }
}
