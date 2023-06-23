package com.progra.hangman.base;

public class LargeWord extends Word{
    LargeWord(int Maxtries, String word){
        super(Maxtries, word);
        this.word = word;

        this.Maxtries = Maxtries;
    }
}
