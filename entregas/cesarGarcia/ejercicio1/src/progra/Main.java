package cesarGarcia.ejercicio1.src.progra;

import cesarGarcia.ejercicio1.src.progra.hangman.UserInterface;

public class Main {
    public static void main(String[] args) {
        /*
         * Este código lo he puesto en el Main para que puedas probar
         * el juego de ahorcado.
         * El ejemplo de la salida por consola lo puedes ver en el
         * archivo docs/ejemplo-salida-consola.txt
         */

        UserInterface ui = new UserInterface();
        ui.start("entregas/cesarGarcia/ejercicio1/data/word-list.txt");
        ui.play();
    }
}