package Hangman;

import base.Word;

public class HangManLogic {
    private Word word;
    private String guessedLetters;
    private int numberOfFaults;

    public HangManLogic(Word word) {
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
        if (!this.guessedLetters.contains(letter)) {
            if (this.word.getWord().contains(letter)) {
                this.guessedLetters = this.guessedLetters + letter;
            } else {
                ++this.numberOfFaults;
                this.guessedLetters = this.guessedLetters + letter;
            }
        }

    }

    public boolean isGameOver() {
        return this.numberOfFaults > this.word.getMaxTries();
    }

    public boolean isWon() {
        String guessedWord = this.hiddenWord().replaceAll("_", "");
        return this.word.getLength() == guessedWord.length();
    }

    public String getHangman() {
        String hangman = "";
        switch (this.numberOfFaults) {
            case 1:
                hangman = "\n\n|\n|\n|\n|\n|\n|_______________________\n";
                break;
            case 2:
                hangman = "\n_________\n|\n|\n|\n|\n|\n|_______________________\n";
                break;
            case 3:
                hangman = "\n_________\n|                   |\n|\n|\n|\n|\n|_______________________\n";
                break;
            case 4:
                hangman = "\n_________\n|                   |\n|                  O\n|\n|\n|\n|_______________________\n";
                break;
            case 5:
                hangman = "\n_________\n|                   |\n|                  O\n|                   |\n|\n|\n|_______________________\n";
                break;
            case 6:
                hangman = "\n_________\n|                   |\n|                  O\n|               ---|\n|\n|\n|_______________________\n";
                break;
            case 7:
                hangman = "\n_________\n|                   |\n|                  O\n|               ---|---\n|\n|\n|_______________________\n";
                break;
            case 8:
                hangman = "\n_________\n|                   |\n|                  O\n|               ---|---\n|                  /\n|                /\n|_______________________\n";
        }

        if (this.numberOfFaults >= this.word.getMaxTries()) {
            hangman = "\n_________\n|                   |\n|                  O\n|               ---|---\n|                  /\n|                /\n|_______________________\n";
        }

        return hangman;
    }

    public String hiddenWord() {
        int wordLength = this.word.getLength();
        String hiddenWord = "";

        for(int count = 0; count < wordLength; ++count) {
            char thisLetter = this.word.getWord().charAt(count);
            String stringLetter = "" + thisLetter;
            if (this.guessedLetters.contains(stringLetter)) {
                hiddenWord = hiddenWord + thisLetter;
            } else {
                hiddenWord = hiddenWord + "_";
            }
        }

        return hiddenWord;
    }
}