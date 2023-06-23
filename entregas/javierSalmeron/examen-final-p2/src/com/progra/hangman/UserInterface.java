package com.progra.hangman;

import com.progra.hangman.base.Word;
import com.progra.hangman.parsers.WordParser;
import com.progra.hangman.exceptions.InvalidIdException;
import com.progra.hangman.exceptions.InvalidWordException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class UserInterface {
    List<Word> words;
    int currentWordIndex;
    boolean gameOver;

    HangmanLogic logic;

    public UserInterface() {
        this.words = new ArrayList<>();
        this.currentWordIndex = 0;
    }

    private int randomIndex() {
        Random random = new Random();
        return random.nextInt(this.words.size());
    }

    public int sizeListWord() {
        return words.size();
    }

    private void loadData(String filename) {
    try {
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line = reader.readLine();
        WordParser wordParser = new WordParser();

        while (line != null) {
            words.add(wordParser.parse(line));
            line = reader.readLine();
        }
        reader.close();
    } catch (IOException e) {
        throw new RuntimeException("File not found: " + filename);
    } catch (InvalidWordException e) {
        throw new RuntimeException("Invalid word in file: " + filename);
    }
}


    public void start(String filename) {
        loadData(filename);
        Word randomWord = words.get(randomIndex());
        this.logic = new HangmanLogic(randomWord);
    }

    public void play() {
        Scanner reader = new Scanner(System.in);

        System.out.println("==========================================================");
        System.out.println("=                      AHORCADO                          =");
        System.out.println("==========================================================");
        System.out.println("");
        printMenu();

        while (!this.gameOver && !this.logic.isWon()) {

            System.out.println("\nPalabra a adivinar con " + this.logic.hiddenWord().length() + " letras:");
            System.out.println(this.logic.hiddenWord());

            System.out.println("Ingrese una letra: ");
            String letter = reader.nextLine();

            if (letter.equals("salir")) {
                System.out.println("Gracias por jugar!");
                break;
            } else if (letter.length() == 1) {
                this.logic.guessLetter(letter.toUpperCase());
            } else if (letter.isEmpty()) {
                printMenu();
            }

            System.out.println(this.logic.getHangman());
            this.gameOver = this.logic.isGameOver();
        }

        if (this.logic.isWon()) {
            System.out.println("Ganaste!");
        } else {
            System.out.println("Perdiste!");
        }
    }

    public void printMenu() {
        System.out.println("* Instrucciones *");
        System.out.println("salir   -  Salir del juego");
        System.out.println("Para jugar, ingrese una letra y presione enter. ");
    }
}
