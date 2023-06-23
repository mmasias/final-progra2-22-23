package com.progra.hangman.base;

public class ShortWord extends Word{
    ShortWord(int Maxtries, String word){
        super(Maxtries, word);
        this.word = word;

        this.Maxtries = Maxtries;
    }
}
