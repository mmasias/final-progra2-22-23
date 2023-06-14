package hangman;

import hangman.base.MediumWord;
import hangman.base.Word;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

class UserInterface {
    private List<Word> words;
    private int currentWordIndex;
    private boolean gameOver;
    private HangmanLogic logic;
    private Scanner scanner;

    public UserInterface() {
        words = new ArrayList<>();
        currentWordIndex = 0;
        gameOver = false;
        logic = null;
        scanner = new Scanner(System.in);
    }

    private void loadData() {
        words.add(new MediumWord(1, "apple"));
        words.add(new MediumWord(2, "banana"));
        words.add(new MediumWord(3, "cherry"));
    }

    public void start() {
        loadData();
        currentWordIndex = randomIndex();
        logic = new HangmanLogic(words.get(currentWordIndex));

        while (!gameOver) {
            printMenu();
            String input = scanner.nextLine();
            switch (input.toLowerCase()) {
                case "1":
                    play();
                    break;
                case "2":
                    gameOver = true;
                    System.out.println("Gracias por jugar. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione nuevamente.");
                    break;
            }
        }
    }

    private int randomIndex() {
        return new Random().nextInt(words.size());
    }

    private void printMenu() {
        System.out.println("Juego del Ahorcado");
        System.out.println("------------------");
        System.out.println("Selecciona una opción:");
        System.out.println("1. Jugar");
        System.out.println("2. Salir");
    }

    private void play() {
        System.out.println("Adivina la palabra:");
        System.out.println(logic.hiddenWord());

        while (!logic.isGameOver()) {
            System.out.print("Ingresa una letra: ");
            String input = scanner.nextLine();
            logic.guessLetter(input);
            System.out.println("Palabra oculta: " + logic.hiddenWord());
            System.out.println("Intentos restantes: " + (logic.getMaxTries() - logic.numberOfFaults()));
            System.out.println("Letras adivinadas: " + logic.guessedLetters());
            System.out.println();
        }

        if (logic.isWon()) {
            System.out.println("¡Felicitaciones! Has adivinado la palabra correctamente.");
        } else {
            System.out.println("Has perdido. La palabra correcta era: " + logic.getWord());
        }

        System.out.println();
    }
}
