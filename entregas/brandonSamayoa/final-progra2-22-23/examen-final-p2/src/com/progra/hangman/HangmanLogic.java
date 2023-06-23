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

    public int getNumberOfFaults() {
        return numberOfFaults;
    }

    public String getGuessedLetters() {
        return guessedLetters;
    }

    public void guessLetter(String letter) {
        letter = letter.toUpperCase();
        if (!guessedLetters.contains(letter)) {
            guessedLetters += letter;
            if (!word.getWord().contains(letter)) {
                numberOfFaults++;
            }
        }
    }

    public boolean isGameOver() {
        return numberOfFaults >= word.getMaxTries();
    }

    public boolean isWon() {
        return word.getWord().equals(hiddenWord());
    }

    public String getHangman() {
        String[] hangmanParts = {
                "\n" + "\n|" + "\n|" + "\n|" + "\n|" + "\n|" + "\n|_______________________\n",
                "\n_________" + "\n|" + "\n|" + "\n|" + "\n|" + "\n|" + "\n|_______________________\n",
                "\n_________" + "\n|                   |" + "\n|" + "\n|" + "\n|" + "\n|" + "\n|_______________________\n",
                "\n_________" + "\n|                   |" + "\n|                  O" + "\n|" + "\n|" + "\n|" + "\n|_______________________\n",
                "\n_________" + "\n|                   |" + "\n|                  O" + "\n|                   |" + "\n|" + "\n|" + "\n|_______________________\n",
                "\n_________" + "\n|                   |" + "\n|                  O" + "\n|               ---|" + "\n|" + "\n|" + "\n|_______________________\n",
                "\n_________" + "\n|                   |" + "\n|                  O" + "\n|               ---|---" + "\n|" + "\n|" + "\n|_______________________\n",
                "\n_________" + "\n|                   |" + "\n|                  O" + "\n|               ---|---" + "\n|                  /" + "\n|                /" + "\n|_______________________\n",
                "\n_________" + "\n|                   |" + "\n|                  O" + "\n|               ---|---" + "\n|                  /" + "\n|                /" + "\n|_______________________\n"
        };

        if (numberOfFaults >= word.getMaxTries()) {
            return hangmanParts[8];
        } else {
            return hangmanParts[numberOfFaults];
        }
    }

    public String hiddenWord() {
        char[] hiddenWord = new char[word.getWord().length()];

        for (int i = 0; i < word.getWord().length(); i++) {
            for (int k = 0; k < guessedLetters.length(); k++) {
                if (word.getWord().charAt(i) == guessedLetters.charAt(k)) {
                    hiddenWord[i] = guessedLetters.charAt(k);
                }
            }
        }

        return String.valueOf(hiddenWord);
    }
}
