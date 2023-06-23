package com.progra.hangman.base;

public class LargeWord extends Word{
        public LargeWord(int id, String word) {
        super(id, word);
        this.level = "L";
    }
    
        public String getLevel(){
            return this.level;
        }
}
