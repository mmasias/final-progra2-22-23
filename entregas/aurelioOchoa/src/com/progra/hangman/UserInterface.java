package com.progra.hangman;

import com.progra.hangman.base.LargeWord;
import com.progra.hangman.base.MediumWord;
import com.progra.hangman.base.ShortWord;
import com.progra.hangman.base.Word;
import com.progra.hangman.parsers.WordParser;
import com.progra.utils.ReadFile;

import java.io.File;
import java.io.FileNotFoundException;
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

    private List<String> loadData(String filename) throws FileNotFoundException{

        ReadFile scanner = new ReadFile();

        List<String> dataFromFile = scanner.loadSource(filename);

        WordParser wordParser = new WordParser(",");

        for (int wordLine = 0; wordLine < dataFromFile.size(); wordLine++) {
            String word = dataFromFile.get(wordLine)
            wordParser.parse(word);
            
        }

        System.out.println(dataFromFile);

        return dataFromFile;

        //

        /*
        Programa aquí la funcionalidad para cargar las palabras desde el archivo filename
        i: leer el archivo filename y guardar las palabras en la lista words
        i: si el archivo no existe, lanzar una excepción FileNotFoundException
        i: si el archivo no contiene palabras, lanzar una excepción InvalidWordException

        Usar el método WordParser.parse para parsear las palabras

        */

    }

    public void start(String filename) {

        loadData(filename);
        /*
         Cargar las palabras desde el archivo

         EJEMPLO DE UNA LINEA DEL ARCHIVO:
             1,Electroencefalografista,LARGA

             Con la siguiente estructura:
             codigo,palabra,tipo

         Inicializar el juego con una palabra aleatoria

         * */
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