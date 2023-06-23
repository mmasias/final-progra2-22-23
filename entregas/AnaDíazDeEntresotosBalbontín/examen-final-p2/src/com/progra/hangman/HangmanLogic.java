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
    }

    public boolean isGameOver() {

        if (numberOfFaults > word.getMaxTries()){
            return true;                            //si el numero de faltas es mayor a de los intentos se acaba el juego
        }else{
            return false;                           //si no el juego continua
        }
    }

    public boolean isWon() {

        if (word == word){
            return true;
        }else{
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

        // programa aquí la funcionalidad para construir la palabra oculta
        // crea la palabra oculta iterando a través de this.word letra por letra
        // si la letra en cuestión, de this.word, está dentro de this.guessedLetters, ponla en la palabra oculta
        // si la letra en cuestión, de this.word, no está entre las letras adivinadas, reemplácela con _ en la palabra oculta
        //i: repase cada letra en this.word y use guessedLetters.contains(letter) para ver si se ha adivinado la letra actual.
        //i: si es así, agréguelo a hiddenWord. si no, agregue "_" a hiddenWord. luego pasar a la siguiente letra




        // return the hidden word at the end

        return "";
    }

}


