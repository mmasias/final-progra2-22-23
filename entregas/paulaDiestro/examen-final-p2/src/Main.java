import com.progra.hangman.UserInterface;
import com.progra.hangman.exceptions.InvalidIdException;
import com.progra.interfaces.Calc;
import com.progra.interfaces.AdvancedArithmetic;

public class Main {
    public static void main(String[] args) throws InvalidIdException {
        /*
         * Este código lo he puesto en el Main para que puedas probar
         * el juego de ahorcado.
         * El ejemplo de la salida por consola lo puedes ver en el
         * archivo docs/ejemplo-salida-consola.txt
         */

        UserInterface ui = new UserInterface();
        ui.start("data/word-list.txt");
        ui.play();
    }

}