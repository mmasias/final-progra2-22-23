package com.progra.hangman;

import com.progra.hangman.base.Word;
import com.progra.hangman.exceptions.InvalidWordException;
import com.progra.hangman.parsers.WordParser;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class UserInterface {
    List<Word> words;
    int currentWordIndex;
    boolean gameOver;

    HangmanLogic logic;

    WordParser parser;

    public UserInterface() {
        this.words = new ArrayList<>();
        this.currentWordIndex = 0;
        parser = new WordParser();
    }

    private int randomIndex() {
        Random random = new Random();
        return random.nextInt(words.size());
    }

    public int sizeListWord() {
        return words.size();
    }

    private void loadData(String filename){
        try {
            File file = new File(filename);
            Scanner reader = new Scanner(file);

            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                Word word = parser.parse(data);
                words.add(word);
            }
            reader.close();
        } catch (FileNotFoundException | InvalidWordException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    public void start(String filename) {
        loadData(filename);
        this.currentWordIndex = randomIndex();
        this.logic = new HangmanLogic(this.words.get(this.currentWordIndex));
        this.gameOver = false;
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
            System.out.println( this.logic.hiddenWord());

            System.out.println("Ingrese una letra: ");
            String letter = reader.nextLine();

            if (letter.equals("salir")) {
                System.out.println("Gracias por jugar!");
                break;
            }else if (letter.length()==1) {
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
