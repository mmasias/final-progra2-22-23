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


    public void guessLetter(String letter) {  // 83.1
         /* Programa aquí la funcionalidad para adivinar
         si la letra ya fue adivinada, no pasa nada
        i: si la letra ha sido adivinada, agrega letra a la variable guessedLetters.
        si la palabra no contiene la letra adivinada, aumenta el número de fallas
        i: aumentar el número de fallas solo si la letra no se ha adivinado y la letra no está en Word

        i: siempre agregue la letra ingresada guessedLetters (Para evitar contar como error si meten otra letra que no va),
        a menos que se haya adivinado antes de llamar a este método.
         */

        if (guessedLetters.contains(letter)) {
            // if it is already guessed, do nothing.
        } else if (word.getWord().contains(letter)) {
            guessedLetters += letter;  //add guessed letter to guessedLetters variable if letter is not already guessed.
        } else {
            numberOfFaults++;
            guessedLetters += letter;
        }
    }

    public boolean isGameOver() {
         /* programa aquí la funcionalidad para verificar si el juego ha terminado
           si el número de faltas es mayor que el número máximo de faltas, el juego termina
           i: si el número de fallas es mayor que el número máximo de intentos, el juego termina.
         */

        if (numberOfFaults > word.getMaxTries()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isWon() {
      /* programa aquí la funcionalidad para comprobar si se gana el juego
         si se adivina la palabra, se gana el juego
         i: si la cantidad de letras sin los guiones es igual a la cantidad de letras de la palabra, se gana el juego.
         */

        String guessedWord = hiddenWord().replaceAll("_", "");
        if (word.getLength() == guessedWord.length()) {
            return true;
        } else {
            return false;
        }
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
        // Programa aquí la funcionalidad para construir la palabra oculta
        // crea la palabra oculta iterando a través de this.word letra por letra
        // si la letra en cuestión, de this.word, está dentro de this.guessedLetters, ponla en la palabra oculta
        // si la letra en cuestión, de this.word, no está entre las letras adivinadas, reemplácela con _ en la palabra oculta
        //i: repase cada letra en this.word y use guessedLetters.contains(letter) para ver si se ha adivinado la letra actual.
        //i: si es así, agréguelo a hiddenWord. si no, agregue "_" a hiddenWord. luego pasar a la siguiente letra




        // return the hidden word at the end
        int wordLength = this.word.getLength();
        String hiddenWord = "";

        for (int count = 0; count < wordLength; count++) {
            char thisLetter = this.word.getWord().charAt(count);
            String stringLetter = "" + thisLetter;

            if (this.guessedLetters.contains(stringLetter)) {
                hiddenWord += thisLetter;
            } else {
                hiddenWord += "_";
            }
        }
        return hiddenWord;
    }

}