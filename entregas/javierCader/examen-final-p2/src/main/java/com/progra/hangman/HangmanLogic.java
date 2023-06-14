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

        /* Programa aquí la funcionalidad para adivinar
         si la letra ya fue adivinada, no pasa nada
        i: si la letra ha sido adivinada, agrega letra a la variable guessedLetters.
        si la palabra no contiene la letra adivinada, aumenta el número de fallas
        i: aumentar el número de fallas solo si la letra no se ha adivinado y la letra no está en Word

        i: siempre agregue la letra ingresada guessedLetters (Para evitar contar como error si meten otra letra que no va),
        a menos que se haya adivinado antes de llamar a este método.
         */
        if (this.word.getWord().contains(letter) && !this.guessedLetters.contains(letter)) {
            this.guessedLetters += letter;
        } else if (!this.word.getWord().contains(letter) && !this.guessedLetters.contains(letter)) {
            this.numberOfFaults++;
            this.guessedLetters += letter;
        }
    }

    public boolean isGameOver() {
        if(this.numberOfFaults > this.word.getMaxTries()){
            return true;
        }
        return false;
    }

    public boolean isWon() {

        if (this.word.getWord().length() == this.guessedLetters.length()) {
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
        String hiddenWord = "";

        for (int i = 0; i < this.word.getWord().length(); i++) {
            String letter = "" + this.word.getWord().charAt(i);
            if (this.guessedLetters.contains(letter)) {
                hiddenWord += letter;
            } else {
                hiddenWord += "_";
            }
        }

        return hiddenWord;
    }
}
