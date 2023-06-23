package Hangman;


import Hangman.Bases.Word;
import Hangman.Parsers.WordParser;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class UserInterface {
    List<Word> words = new ArrayList();
    int currentWordIndex = 0;
    boolean gameOver;
    HangmanLogic logic;

    public UserInterface() {
    }

    private int randomIndex() {
        Random random = new Random();
        return random.nextInt(this.words.size());
    }

    public int sizeListWord() {
        return this.words.size();
    }

    private void loadData(String filename) {
        ReadFile reader = new ReadFile();

        try {
            List<String> stringList = reader.loadSource(filename);
            Iterator var4 = stringList.iterator();

            while(var4.hasNext()) {
                String line = (String)var4.next();
                WordParser wordParser = new WordParser(",");
                this.words.add(wordParser.parse(line));
            }
        } catch (FileNotFoundException var7) {
            System.err.println(var7.getMessage());
        }

    }

    public void start(String filename) {
        System.out.println("Iniciando carga de datos");
        this.loadData(filename);
        this.currentWordIndex = this.randomIndex();
        this.gameOver = false;
        this.logic = new HangmanLogic((Word)this.words.get(this.currentWordIndex));
    }

    public void play() {
        Scanner reader = new Scanner(System.in);
        System.out.println("==========================================================");
        System.out.println("=                      AHORCADO                          =");
        System.out.println("==========================================================");
        System.out.println("");
        this.printMenu();

        while(!this.gameOver && !this.logic.isWon()) {
            System.out.println("Palabra a adivinar con " + this.logic.hiddenWord().length() + " letras:");
            System.out.println(this.logic.hiddenWord());
            System.out.println("Ingrese una letra: ");
            String letter = reader.nextLine();
            if (letter.equals("salir")) {
                System.out.println("Gracias por jugar!");
                break;
            }

            if (letter.length() == 1) {
                this.logic.guessLetter(letter.toUpperCase());
            } else if (letter.isEmpty()) {
                this.printMenu();
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
