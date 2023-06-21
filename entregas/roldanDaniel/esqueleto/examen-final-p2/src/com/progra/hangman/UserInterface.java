package com.progra.hangman;

import com.progra.hangman.base.Word;
import com.progra.hangman.parsers.WordParser;
import com.progra.utils.ReadFile;
import exceptions.InvalidWordException;

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

    private void loadData(String filename) throws FileNotFoundException {

        ReadFile fileReader = new ReadFile();
        List<String> data = fileReader.loadSource(filename);
        WordParser parser = new WordParser();
        if(data == null) try {
            throw new FileNotFoundException();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        if (data.isEmpty()) try {
            throw new InvalidWordException("Word not valid, Valores de la palabra faltantes");
        } catch (InvalidWordException e) {
            throw new RuntimeException(e);
        }

        words = data.stream()
                .map(j -> {
                    try {
                        return parser.parse(j);
                    } catch (InvalidWordException e) {
                        throw new RuntimeException(e);
                    }
                })
                .collect(Collectors.toList());


        }

    public void start(String filename) throws FileNotFoundException, InvalidWordException {

      // Programa aquí la funcionalidad para cargar las palabras desde el archivo filename
        loadData(filename);
        Word word = this.words.get( (int) (Math.random() * (words.size()-1)) );
        this.logic = new HangmanLogic(word);
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
