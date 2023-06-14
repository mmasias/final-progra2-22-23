import com.progra.hangman.UserInterface;
import interfaces.Calc;

public class Main {
    public static void main(String[] args) {
        /*
         * Este código lo he puesto en el Main para que puedas probar
         * el juego de ahorcado.
         * El ejemplo de la salida por consola lo puedes ver en el
         * archivo docs/ejemplo-salida-consola.txt
         */

        UserInterface ui = new UserInterface();
        ui.start("data/word-list.txt");
        ui.play();

        // Interfaces - ejercicio 2
        Calc calc = new Calc();
        System.out.println(calc.divisorSum(6));
        // System.out.println(calc.divisorSum(1000)); throws error
        System.out.println(calc.describeDivisors(6));
        // System.out.println(calc.describeDivisors(1000)); throws error
    }
}