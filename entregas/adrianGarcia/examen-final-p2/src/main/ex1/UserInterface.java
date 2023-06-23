package main.ex1;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class UserInterface {
    private List<Word> words;
    private int currentWordIndex;
    private boolean gameOver;
    private HangmanLogic logic;

    public UserInterface() {
        currentWordIndex = -1;
        gameOver = false;
        logic = new HangmanLogic();
    }

    private int randomIndex() {
        Random random = new Random();
        return random.nextInt(words.size());
    }

    public void loadData(String wordData) {
        String[] wordArray = wordData.split(",");
        words = new ArrayList<>();

        for (String word : wordArray) {
            Word newWord = new Word(word.trim());
            words.add(newWord);
        }
    }

    public void start(String wordData) {
        loadData(wordData);
        currentWordIndex = randomIndex();
        gameOver = false;
        play();
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);

        while (!gameOver) {
            Word currentWord = words.get(currentWordIndex);

            System.out.println("Guess the word: " + currentWord.getDisplayWord());
            System.out.print("Enter a letter: ");
            String input = scanner.nextLine();

            if (input.length() != 1) {
                System.out.println("Invalid input! Please enter a single letter.");
                continue;
            }

            char letter = input.charAt(0);
            boolean correctGuess = logic.guessLetter(currentWord, letter);

            if (correctGuess) {
                System.out.println("Correct guess!");
            } else {
                System.out.println("Incorrect guess!");
                logic.decreaseAttempts();
            }

            System.out.println("Attempts left: " + logic.getRemainingAttempts());
            System.out.println("Guessed letters: " + logic.getGuessedLetters());

            if (logic.isWordGuessed(currentWord)) {
                System.out.println("Congratulations! You guessed the word: " + currentWord.getOriginalWord());
                gameOver = true;
            } else if (logic.isGameOver()) {
                System.out.println("Game over! You ran out of attempts.");
                System.out.println("The word was: " + currentWord.getOriginalWord());
                gameOver = true;
            }
        }
    }

    public void printMenu() {
        System.out.println("---- Hangman Menu ----");
        System.out.println("1. Start new game");
        System.out.println("2. Exit");
    }
}

