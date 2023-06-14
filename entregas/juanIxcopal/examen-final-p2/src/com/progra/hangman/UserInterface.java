package com.progra.hangman;

import com.progra.hangman.base.*;

import com.progra.hangman.exceptions.InvalidWordException;
import com.progra.hangman.parsers.WordParser;

import com.progra.hangman.utils.ReadFile;

import java.util.*;
import java.io.*;
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

    public int randomIndex(){
        Random random = new Random();
        return random.nextInt(this.words.size());
    }

    public void loadData(String filename) throws FileNotFoundException, InvalidWordException  {

        ReadFile fileReader = new ReadFile();
        List<String> csv = fileReader.loadSource(filename);
        com.progra.hangman.parsers.WordParser parser = new WordParser();
        if(csv == null) throw new FileNotFoundException();
        if(csv.isEmpty()) throw new InvalidWordException("INVALID");

        this.words = csv.stream().map(j -> {
            try {
                return parser.parse(j);
            } catch (InvalidWordException e) {
                throw new RuntimeException(e);
            }
        }).collect(Collectors.toList());

    }

    public void start(String filename) throws InvalidWordException, FileNotFoundException {
        loadData(filename);
        Word word = this.words.get(randomIndex());
        this.logic = new HangmanLogic(word);
    }

    public void play(){
        Scanner reader = new Scanner(System.in);

        System.out.println("*****************************************************");
        System.out.println("##            -----HANGMAN GAME-----               ##");
        printMenu();

        while (!this.gameOver && !this.logic.isWon()) {

            System.out.println("-----------------------------------------------------");
            System.out.println("##   --The word to guess contains " + this.logic.hiddenWord().length() + " letters--     ##");
            System.out.println( this.logic.hiddenWord());

            System.out.print("##  Enter a letter: ");
            String letter = reader.nextLine();

            if (letter.equals("Exit")) {
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
            System.out.println("=====================================================");
            System.out.println("*********** You have won, congratulations! **********");
        } else {
            System.out.println("=====================================================");
            System.out.println("********** You lost, good luck next time :( *********");
        }
    }

    public void printMenu(){
        System.out.println("=====================================================");
        System.out.println("------------------- #Instructions# ------------------");
        System.out.println("## ----To play, enter a letter and press enter---- ##");
        System.out.println("*****************************************************");
    }

    public int sizeListWord() {
        return words.size();
    }

}
