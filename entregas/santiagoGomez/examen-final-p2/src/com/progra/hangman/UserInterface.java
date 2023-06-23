package com.progra.hangman;

import com.progra.hangman.base.Word;
import com.progra.hangman.exceptions.InvalidWordException;
import com.progra.hangman.parsers.WordParser;
import com.progra.utils.ReadFile;

import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

        /*
        Programa aquí la funcionalidad para cargar las palabras desde el archivo filename
        i: leer el archivo filename y guardar las palabras en la lista words
        i: si el archivo no existe, lanzar una excepción FileNotFoundException
        i: si el archivo no contiene palabras, lanzar una excepción InvalidWordException

        Usar el método WordParser.parse para parsear las palabras

        */
        ReadFile fileReader = new ReadFile();
        List<String> csv = fileReader.loadSource(filename);
        WordParser parser = new WordParser();
        if(csv == null) throw new FileNotFoundException();
        if(csv.isEmpty()) throw new InvalidWordException("INVALID");

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

    public void start(String filename) throws FileNotFoundException, InvalidWordException {
        /*
          Cargar las palabras desde el archivo

         EJEMPLO DE UNA LINEA DEL ARCHIVO:
             1,Electroencefalografista,LARGA

             Con la siguiente estructura:
             codigo,palabra,tipo

         Inicializar el juego con una palabra aleatoria

         * */

        loadData(filename);
        Word word = this.words.get(randomIndex());
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
            System.out.println("+----------------------------------------------------+");
            System.out.println("\nWord to guess has " + this.logic.hiddenWord().length() + " letters:");
            System.out.println( this.logic.hiddenWord());
            System.out.println("+----------------------------------------------------+");

            System.out.println("Enter a letter: ");
            String letter = reader.nextLine();
            System.out.println("+----------------------------------------------------+");


            if (letter.equals("exit")) {
                System.out.println("Thanks for playing!");
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
            System.out.println("You're the best!");
        } else {
            System.out.println("Good luck next time!");
        }
    }


    public void printMenu() {
        System.out.println("+----------------------------------------------------+");
        System.out.println("* Instructions *");
        System.out.println("exit   -  Exit the game");
        System.out.println("To be able to play, you need to enter a letter ");
        System.out.println("+----------------------------------------------------+");


    }

}
