package com.progra.hangman;
import com.progra.hangman.base.Word;
import com.progra.hangman.exceptions.InvalidWordException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;


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

    private void loadData(String filename) throws FileNotFoundException, InvalidWordException {
        File f= new File(filename);
        if (!f.exists()){
            throw new FileNotFoundException();
        }
        if (f.length()==0){
            throw new InvalidWordException("The word doesnt exist");
        }
    }

    public void start(String filename) {

    }

    public void play() {
        Scanner reader = new Scanner(System.in);

        System.out.println("----------------------------------------------------------");
        System.out.println("-                      AHORCADO                          -");
        System.out.println("----------------------------------------------------------");
        System.out.println("");
        printMenu();

        while (!this.gameOver && !this.logic.isWon()) {


            System.out.println("\nWord to guess with " + this.logic.hiddenWord().length() + " letters:");
            System.out.println( this.logic.hiddenWord());

            System.out.println("Tell me a letter: ");
            String letter = reader.nextLine();

            if (letter.equals("Get out")) {
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
            System.out.println("¡You won!");
        } else {
            System.out.println("¡Looser!");
        }
    }


    public void printMenu() {
        System.out.println("Instructions");
        System.out.println("Get out of the game");
        System.out.println("To play, press enter");
    }

}
