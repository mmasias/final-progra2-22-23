package com.progra.hangman;

import com.progra.hangman.base.Word;
import com.progra.hangman.exceptions.InvalidWordException;
import com.progra.hangman.parsers.WordParser;
import com.progra.utils.ReadFile;


import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

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

    private void loadData(String filename) throws FileNotFoundException, InvalidWordException {

        ReadFile fileReader = new ReadFile();
        List<String> csv = fileReader.loadSource(filename);
        WordParser parser = new WordParser();
        if (csv == null) throw new FileNotFoundException();
        if (csv.isEmpty()) throw new InvalidWordException("Word not valid, Valores de la palabra faltantes");

        this.words = csv.stream()
                .map(j -> {
                    try {
                        return parser.parse(j);
                    } catch (InvalidWordException e) {
                        throw new RuntimeException(e);
                    }
                })
                .collect(Collectors.toList());
    }


    public Object start(String filename) {
        try {
            this.loadData(filename);
            this.logic = new HangmanLogic(this.words.get(this.randomIndex()));
            this.play();
            return this.logic.isWon();
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no existe");
            return false;
        } catch (InvalidWordException e) {
            System.out.println("La palabra no es válida");
            return false;
        }
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
