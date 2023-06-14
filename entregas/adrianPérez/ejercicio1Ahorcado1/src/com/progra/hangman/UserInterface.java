package com.progra.hangman;
import com.progra.hangman.base.Word;
import com.progra.hangman.exceptions.InvalidWordException;
import com.progra.hangman.parsers.WordParser;
import com.progra.utils.ReadFile;

import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Collectors;

public class UserInterface {
    HangmanLogic logic;

    List<Word> words;
    int currentWordIndex;
    boolean gameOver;

    public UserInterface() {
        this.words = new ArrayList<>();
        this.currentWordIndex = 0;
    }

    private int randomIndex() {
        Random random = new Random();
        return random.nextInt(this.words.size());
    }

    public void start(String filename) throws InvalidWordException, FileNotFoundException {

        try {  
            loadData(filename);
        } catch (FileNotFoundException e){
            throw new RuntimeException(e);
        } catch (InvalidWordException e) {
            throw new RuntimeException(e);
        }
        Word word = this.words.get( (int) (Math.random() * (words.size()-1)) );
        this.logic = new HangmanLogic(word);
    }

    public int sizeListWord() {
        return words.size();
    }
    
    private void loadData(String filename) throws InvalidWordException, FileNotFoundException  {

        ReadFile fileReader = new ReadFile();
        List<String> csv = fileReader.loadSource(filename);
        WordParser parser = new WordParser();
        if(csv == null) throw new FileNotFoundException();
        if(csv.isEmpty()) throw new InvalidWordException("Not a valid word.");

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

    public void play() {
        Scanner reader = new Scanner(System.in);


        System.out.println("==========================================================");
        System.out.println("=                      HANGMAN                          =");
        System.out.println("==========================================================");
        System.out.println("");
        printMenu();

        while (!this.gameOver && !this.logic.isWon()) {


            System.out.println("\nThe word has " + this.logic.hiddenWord().length() + " letters:");
            System.out.println( this.logic.hiddenWord());

            System.out.println("Write a letter:");
            String letter = reader.nextLine();

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
            System.out.println("You won!");
        } else {
            System.out.println("You lost!");
        }

    }


    public void printMenu() {
        System.out.println("* Instructions *");
        System.out.println("exit - to exit the game");
        System.out.println("To play, write a letter and press enter.");
    }

}
