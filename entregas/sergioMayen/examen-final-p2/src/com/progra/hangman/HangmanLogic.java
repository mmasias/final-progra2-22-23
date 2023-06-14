package com.progra.hangman;

import com.progra.hangman.base.Word;

import java.util.Scanner;

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

        letter= word.getWord();
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
        /* programa aquí la funcionalidad para verificar si el juego ha terminado
         si el número de faltas es mayor que el número máximo de faltas, el juego termina
         i: si el número de fallas es mayor que el número máximo de intentos, el juego termina.
         */
        try{
            if(numberOfFaults == 3){
                return true;
            }
        }catch (Exception e) {
            System.out.println(e);
        }

        return false;
    }

    public boolean isWon(char[] letrasAdivinadas) {
        /* programa aquí la funcionalidad para comprobar si se gana el juego
         si se adivina la palabra, se gana el juego
         i: si la cantidad de letras sin los guiones es igual a la cantidad de letras de la palabra, se gana el juego.
         */

        try{
            if (isWon(letrasAdivinadas)) {
                System.out.println("\n¡Felicidades! Adivinaste la palabra '");
            } else {
                System.out.println("\nLo siento, no adivinaste la palabra. La palabra correcta era. '");
            }

            for (char letra : letrasAdivinadas) {
                if (letra == '_') {
                    return false;
                }
            }
            return true;

        }catch (Exception e) {
            System.out.println(e);
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

        Scanner scanner = new Scanner(System.in);

        System.out.print("Letra: ");
        String palabra = scanner.nextLine();

        char[] letrasAdivinadas = new char[palabra.length()];
        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
        }

        boolean palabraAdivinada = false;
        int intentos = 0;

        while (!palabraAdivinada) {
            System.out.println("\nPalabra adivinada: " + String.valueOf(letrasAdivinadas));
            System.out.print("Ingresa una letra: ");
            char input = scanner.nextLine().charAt(0);

            boolean letraAdivinada = false;

            for (int i = 0; i < palabra.length(); i++) {
                if (palabra.charAt(i) == input) {
                    letrasAdivinadas[i] = input;
                    letraAdivinada = true;
                }
            }

            if (letraAdivinada) {
                System.out.println("¡Correcto! La letra '" + input + "' está en la palabra.");
            } else {
                System.out.println("Incorrecto. La letra '" + input + "' no está en la palabra.");
                intentos++;
            }

            if (String.valueOf(letrasAdivinadas).equals(palabra)) {
                palabraAdivinada = true;
            }
        }

        System.out.println("\n¡Felicidades! Adivinaste la palabra '" + palabra + "' en " + intentos + " intentos.");

        scanner.close();

        return letrasAdivinadas;
    }

}
