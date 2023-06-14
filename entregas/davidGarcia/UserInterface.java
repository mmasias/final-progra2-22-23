import base.Word;
import exceptions.InvalidWordException;
import parser.WordParser;

import java.io.*;
import java.util.*;

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
        return random.nextInt(this.words.size());
    }

    public int sizeListWord() {
        return words.size();
    }

    private void loadData(String filename) throws FileNotFoundException, InvalidWordException {

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
            throw new InvalidWordException("The file not contains words");
        }
        String line="";
        WordParser parser= new WordParser();
        BufferedReader reader= new BufferedReader(new FileReader(f));
        try {
            while ((line=reader.readLine())!=null){
                words.add(parser.parse(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
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
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InvalidWordException e) {
            throw new RuntimeException(e);
        }
        this.logic = new HangmanLogic(this.words.get(randomIndex()));
    }


    public void play() {
        Scanner reader = new Scanner(System.in);


        System.out.println("*=================================================*");
        System.out.println("*                      AHORCADO                   *");
        System.out.println("*=================================================*");
        System.out.println("");
        printMenu();

        while (!this.gameOver && !this.logic.isWon()) {


            System.out.println("\nWord to guess with " + this.logic.hiddenWord().length() + " letters:");
            System.out.println( this.logic.hiddenWord());

            System.out.println("Put a letter: ");
            String letter = reader.nextLine();

            if (letter.equals("Go out")) {
                System.out.println("Thank you for play!");
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
            System.out.println("You win!");
        } else {
            System.out.println("You lose!");
        }
    }


    public void printMenu() {
        System.out.println("* Settings *");
        System.out.println("out  -  end game ");
        System.out.println("To play, put a letter and hit enter. ");
    }

}
