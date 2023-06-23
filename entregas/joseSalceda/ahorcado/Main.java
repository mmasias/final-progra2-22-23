package entregas.joseSalceda.ahorcado;

import entregas.joseSalceda.ahorcado.com.progra.hangman.UserInterface;
import entregas.joseSalceda.ahorcado.com.progra.hangman.exceptions.InvalidWordException;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws InvalidWordException, FileNotFoundException {

        UserInterface ui = new UserInterface();
        ui.start("data/word-list.txt");
        ui.play();

    }
}