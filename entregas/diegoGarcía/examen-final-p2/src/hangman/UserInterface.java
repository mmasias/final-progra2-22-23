package hangman;

import hangman.base.MediumWord;
import hangman.base.Word;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class UserInterface {
    List<Word> words;
    private int currentWordIndex;
    private boolean gameOver;
    private HangmanLogic logic;

    public UserInterface() {
        words = new ArrayList<>();
        currentWordIndex = 0;
        gameOver = false;
        logic = null;
    }

    private int randomIndex() {
        return (int) (Math.random() * words.size());
    }

    public void loadData(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                int id = Integer.parseInt(parts[0]);
                String word = parts[1];
                Word newWord = new MediumWord(id, word);
                words.add(newWord);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    public void start(String filePath) {
        loadData(filePath);
        if (words.isEmpty()) {
            System.out.println("No se han cargado palabras.");
            return;
        }

        currentWordIndex = randomIndex();
        Word currentWord = words.get(currentWordIndex);
        logic = new HangmanLogic(currentWord);

        System.out.println("¡Bienvenido al juego del ahorcado!");
        System.out.println("Palabra a adivinar: " + logic.hiddenWord());
        play();
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
            Scanner scanner = new Scanner(System.in);
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
