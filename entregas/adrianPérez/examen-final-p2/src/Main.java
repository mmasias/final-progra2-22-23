import com.progra.hangman.UserInterface;
import com.progra.hangman.exceptions.InvalidWordException;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws InvalidWordException, FileNotFoundException {

        /*
         No se debería de modificar el código de esta clase
         */
        UserInterface ui = new UserInterface();
        ui.start("data/word-list.txt");
        ui.play();

    }
}