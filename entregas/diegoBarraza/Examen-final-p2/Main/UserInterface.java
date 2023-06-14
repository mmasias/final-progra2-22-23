package Main;

import com.progra.hangman.HangmanLogic;
import com.progra.hangman.base.Word;

import java.io.File;
import java.io.FileNotFoundException;
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
            return random.nextInt(this.words.size());
        }

        public int sizeListWord() {
            return words.size();
        }

        private void loadData(String Words)throws FileNotFoundException, Main.InvalidWordException {
            File file = new File(Words);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                if (parts.length == 0) {
                    throw new InvalidWordException("Invalid word format");
                }
                int id = Integer.parseInt(parts[0]);
                String word = parts[1];
                String type = parts[2];
                Word newWord = null;
                this.words.add(newWord);
            }
            if (this.words.size() == 0) {
                throw new Main.InvalidWordException("No words found");
            }
        }

        /*
        Programa aquí la funcionalidad para cargar las palabras desde el archivo filename
        i: leer el archivo filename y guardar las palabras en la lista words
        i: si el archivo no existe, lanzar una excepción FileNotFoundException
        i: si el archivo no contiene palabras, lanzar una excepción Main.HangmanLogic.InvalidWordException

        Usar el método Main.WordParser.parse para parsear las palabras


        */


        public void start(String filename) {
            try {
                this.loadData(filename);
                this.currentWordIndex = this.randomIndex();
                this.logic = new HangmanLogic(this.words.get(this.currentWordIndex));
                this.gameOver = false;
            } catch (FileNotFoundException e) {
                System.out.println("Couldnt load files" + filename);
            } catch (Main.InvalidWordException e) {
                System.out.println("Couldnt load words " + filename);
            }
        }
        /*
         Cargar las palabras desde el archivo

         EJEMPLO DE UNA LINEA DEL ARCHIVO:
             1,Electroencefalografista,LARGA

             Con la siguiente estructura:
             codigo,palabra,tipo

         Inicializar el juego con una palabra aleatoria

         * */


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

