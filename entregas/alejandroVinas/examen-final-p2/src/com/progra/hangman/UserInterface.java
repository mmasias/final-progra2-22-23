package com.progra.hangman;

import com.progra.hangman.base.Word;
import com.progra.hangman.parsers.WordParser;

import java.util.*;
import java.io.*;
import com.progra.hangman.exceptions.InvalidWordException;

public class UserInterface {
    List<Word> words;
    int currentWordIndex;
    boolean gameOver;

    HangmanLogic logic;
    WordParser parser;



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

    private void loadData(String filename){
        try{
            parser = new WordParser();
            filename = "data/words.txt";
            parser.parse(filename);
            words.add(parser.parse(filename));
        }catch (Exception e){
            if (e instanceof FileNotFoundException){
                System.out.println("El archivo no existe");
            }else if (e instanceof InvalidWordException){
                System.out.println("El archivo no contiene palabras");
            }
        }
    }

    public void start(String filename) {
        loadData(filename);
        this.logic = new HangmanLogic(this.words.get(randomIndex()));
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
