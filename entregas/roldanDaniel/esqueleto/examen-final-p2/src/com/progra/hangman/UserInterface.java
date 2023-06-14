package com.progra.hangman;

import com.progra.hangman.base.Word;
import com.progra.hangman.parsers.WordParser;
import com.progra.utils.ReadFile;
import exceptions.InvalidWordException;

import java.io.*;
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

        /*
        Programa aquí la funcionalidad para cargar las palabras desde el archivo filename
        i: leer el archivo filename y guardar las palabras en la lista words
        i: si el archivo no existe, lanzar una excepción FileNotFoundException
        i: si el archivo no contiene palabras, lanzar una excepción InvalidWordException

        Usar el método WordParser.parse para parsear las palabras

        */

        filename ="entregas/roldanDaniel/esqueleto/examen-final-p2/data/word-list.txt";
        File file = new File(filename);
        List<String> data = new ArrayList<String>();
        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader(file));
            while (in.ready()) {
                String line = in.readLine();
                if (line.length() > 0) {
                    data.add(line);
                }
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    System.err.println(e.getMessage());
                }
            }
        }
        System.out.println(data.size() + " elements loaded.");

    }




    public void start(String filename) throws FileNotFoundException, InvalidWordException {
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
