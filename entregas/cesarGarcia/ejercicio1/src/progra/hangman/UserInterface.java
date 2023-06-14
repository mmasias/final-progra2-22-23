package cesarGarcia.ejercicio1.src.progra.hangman;

import cesarGarcia.ejercicio1.src.progra.hangman.base.Word;
import cesarGarcia.ejercicio1.src.progra.hangman.exceptions.InvalidWordException;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
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
        int size = words.size();
        if (size > 0) {
            return random.nextInt(size);
        } else {
            throw new IllegalStateException("La lista de palabras está vacía");
        }
    }

    public int sizeListWord() {
        return words.size();
    }

    private void loadData(String filename) throws IOException, InvalidWordException {

        /*
        Programa aquí la funcionalidad para cargar las palabras desde el archivo filename
        i: leer el archivo filename y guardar las palabras en la lista words
        i: si el archivo no existe, lanzar una excepción FileNotFoundException
        i: si el archivo no contiene palabras, lanzar una excepción InvalidWordException

        Usar el método WordParser.parse para parsear las palabras

        */

        File f= new File(filename);
        if (!f.exists()){
            throw new FileNotFoundException();
        }
        if (f.length()==0){
            throw new InvalidWordException("El fichero no contiene palabras");
        }

        BufferedReader br = new BufferedReader(new FileReader(f));
        String line = "";
        while((line = br.readLine())!=null){
            cesarGarcia.ejercicio1.src.progra.hangman.parsers.WordParser wp = new cesarGarcia.ejercicio1.src.progra.hangman.parsers.WordParser();
            this.words.add(wp.parse(line));

        }
        br.close();

    }

    public void start(String filename) {
        /*
         Cargar las palabras desde el archivo

         EJEMPLO DE UNA LINEA DEL ARCHIVO:
             1,Electroencefalografista,LARGA

             Con la siguiente estructura:
             codigo,palabra,tipo

         Inicializar el juego con una palabra aleatoria

         * */
        try {
            loadData(filename);
        } catch (IOException e) {
            System.out.println("No se pudo cargar el archivo");
        } catch (InvalidWordException e) {
            System.out.println("El archivo no contiene palabras");
        }


        logic = new cesarGarcia.ejercicio1.src.progra.hangman.HangmanLogic(this.words.get(randomIndex()));
    }

    public void play() {
        Scanner reader = new Scanner(System.in);


        System.out.println("==========================================================");
        System.out.println("=                      AHORCADO                          =");
        System.out.println("==========================================================");
        System.out.println("");
        printMenu();

        while (!this.gameOver && !this.logic.isWon()) {


            System.out.println("\nPalabra a adivinar con " + this.logic.hiddenWord().length() + " letras:");
            System.out.println( this.logic.hiddenWord());

            System.out.println("Ingrese una letra: ");
            String letter = reader.nextLine();

            if (letter.equals("salir")) {
                System.out.println("Gracias por jugar!");
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
            System.out.println("Ganaste!");
        } else {
            System.out.println("Perdiste!");
        }
    }


    public void printMenu() {
        System.out.println("* Instrucciones *");
        System.out.println("salir   -  Salir del juego");
        System.out.println("Para jugar, ingrese una letra y presione enter. ");
    }

}
