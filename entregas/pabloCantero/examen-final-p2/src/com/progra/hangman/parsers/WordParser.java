package com.progra.hangman.parsers;

import com.progra.hangman.base.Word;

public class WordParser implements Parser{
    private String regex;
    private int ELEMENT_COUNT;

    public WordParser() {
    }

    public WordParser(String regex) {
        this.regex = regex;
    }
    public Word parse(String regex) {
        String[] splitted = regex.split(this.regex);
        String word = splitted[0];
        int Maxtries = Integer.parseInt(splitted[1]);
        return new Word(Maxtries, word);
    }
    public int idValidator(String regex) {
        String[] splitted = regex.split(this.regex);
        return Integer.parseInt(splitted[1]);
    }
    public void sizeValidator(String regex) {
        String[] splitted = regex.split(this.regex);
        ELEMENT_COUNT = splitted.length;


    }
}
