package com.progra.hangman;

import com.progra.hangman.base.Word;

public class HangmanLogic extends Word {
    private Word word;
    private String guessedLetters;
    private int numberOfFaults;

    public HangmanLogic(Word word) {
        super(word.getMaxtries(), word.getWord());
        this.word = word;
    }

    public String getGuessedLetters() {
        return guessedLetters;
    }

    public int numberOfFaults() {
        return numberOfFaults;
    }
    public String guessedLetters() {
        return guessedLetters;
    }
    public void setGuessedLetters(String guessedLetters) {
        this.guessedLetters = guessedLetters;
    }
    public boolean isGameOver() {
        return numberOfFaults >= getMaxtries();
    }
    public boolean isWon() {
        return word.equals(getGuessedLetters());
    }
    public void guessLetter(String letter) {
        if (!guessedLetters.contains(letter)) {
            if (!word.contains(letter)) {
                numberOfFaults++;
            }
            guessedLetters += letter;
        }
    }
    public String hiddenWord() {
        String hiddenWord = "";
        for (int i = 0; i < word.getlength(); i++) {
            String letter = word.getWord().substring(i, i + 1);
            if (guessedLetters.contains(letter)) {
                hiddenWord += letter;
            } else {
                hiddenWord += "_";
            }
        }
        return hiddenWord;
    }
}
