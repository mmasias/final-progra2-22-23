package com.progra.hangman.base;

public class MediumWord extends Word{
    MediumWord(int Maxtries, String word){
        super(Maxtries, word);
        this.word = word;

        this.Maxtries = Maxtries;
    }


}
