import com.progra.hangman.UserInterface;
import com.progra.hangman.exceptions.InvalidWordException;

import java.io.*;


public class Main {
    public static void main(String[] args) throws InvalidWordException, FileNotFoundException {

        UserInterface ui = new UserInterface();
        ui.start("data/word-list.txt");
        ui.play();
    }
}