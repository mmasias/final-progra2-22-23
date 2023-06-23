package com.progra.hangman;
import com.progra.hangman.base.Word;

public class HangmanLogic {
    private Word word;
    private String guessedLetters;
    private int numberOfFaults;

    public HangmanLogic(Word word) {
        this.word = word;
        this.word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public void guessLetter(String letter) {
        if (word.getWord().indexOf(letter)>=0){
            if(this.guessedLetters.indexOf(letter)<0){
                this.guessedLetters+=letter;
            }

        } else {
            this.numberOfFaults++;
        }
    }

    public boolean isGameOver() {
        if (this.numberOfFaults>word.getMaxTries()){
            return true;
        }
        return false;
    }

    public boolean isWon() {
        String noRepeat= "";
        for (int i = 0; i < word.getLength(); i++) {
            char letter= word.getWord().charAt(i);
            if (noRepeat.indexOf(letter)<0){
                noRepeat=noRepeat+letter;
            }
        }
        if (this.guessedLetters.length()==noRepeat.length()){
            return true;
        }
        return false;
    }

    public String getHangman() {
        String hangman = "";
        switch (numberOfFaults) {
            case 1:
                hangman = "\n" + "\n|" + "\n|" + "\n|" + "\n|" + "\n|" + "\n|_______________________\n";
                break;
            case 2:
                hangman = "\n_________" + "\n|" + "\n|" + "\n|" + "\n|" + "\n|" + "\n|_______________________\n";
                break;
            case 3:
                hangman = "\n_________" + "\n|                   |" + "\n|" + "\n|" + "\n|" + "\n|" + "\n|_______________________\n";
                break;
            case 4:
                hangman = "\n_________" + "\n|                   |" + "\n|                  O" + "\n|" + "\n|" + "\n|" + "\n|_______________________\n";
                break;
            case 5:
                hangman = "\n_________" + "\n|                   |" + "\n|                  O" + "\n|                   |" + "\n|" + "\n|" + "\n|_______________________\n";
                break;
            case 6:
                hangman = "\n_________" + "\n|                   |" + "\n|                  O" + "\n|               ---|" + "\n|" + "\n|" + "\n|_______________________\n";
                break;
            case 7:
                hangman = "\n_________" + "\n|                   |" + "\n|                  O" + "\n|               ---|---" + "\n|" + "\n|" + "\n|_______________________\n";
                break;
            case 8:
                hangman = "\n_________" + "\n|                   |" + "\n|                  O" + "\n|               ---|---" + "\n|                  /" + "\n|                /" + "\n|_______________________\n";
                break;
        }

        if (numberOfFaults >= word.getMaxTries()){
            hangman = "\n_________" + "\n|                   |" + "\n|                  O" + "\n|               ---|---" + "\n|                  /" + "\n|                /" + "\n|_______________________\n";
        }
        return hangman;
    }


    public String hiddenWord() {
        String hidden="";
        for (int i = 0; i < this.word.getWord().length(); i++) {
            char letter= this.word.getWord().charAt(i);
            if (this.guessedLetters.indexOf(letter)>=0){
                hidden+=letter;
            }else {
                hidden+="_";
            }
        }
        return hidden;
    }

}
