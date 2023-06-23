package cesarGarcia.ejercicio1.src.progra.hangman.parsers;

import cesarGarcia.ejercicio1.src.progra.hangman.base.LargeWord;
import cesarGarcia.ejercicio1.src.progra.hangman.base.MediumWord;
import cesarGarcia.ejercicio1.src.progra.hangman.base.ShortWord;
import cesarGarcia.ejercicio1.src.progra.hangman.base.Word;
import cesarGarcia.ejercicio1.src.progra.hangman.exceptions.InvalidIdException;
import cesarGarcia.ejercicio1.src.progra.hangman.exceptions.InvalidWordException;

public class WordParser implements Parser {


    String regex; // Cadena de texto que representa el patrón de expresión regular
    final int ELEMENT_COUNT = 3; // Número de elementos que debe contener la cadena de texto al hacer split

    public WordParser() {
        // Regex por defecto, separa por comas "," la cadena de texto que se le pasa al método parse
        this.regex = ",";
    }

    public WordParser(String regex) {
        this.regex = regex;
    }


    public Word parse(String tokens) throws InvalidWordException {

        /*
        * Tokens es una cadena que contiene la información de una palabra.
        * Se encarga de validar que la cadena contenga 3 elementos separados por el caracter regex caso contrario lanza una excepción InvalidWordException
        * La cadena debe tener la forma:
        * codigo,palabra,tipo
        * codigo: es un número que identifica la palabra
        * palabra: es la palabra en sí
        * tipo: es el tipo de palabra que es: LARGA, MEDIA o CORTA
        * Dependiendo del tipo crear la instancia de la clase Word correspondiente, que puede ser de la clase WordShort, WordMedium o WordLong
        * */

        try {
            String[] data = tokens.split(",");
            sizeValidator(data); // Validar el tamaño de la cadena de tokens
            Word word = null;
            switch (data[2].toUpperCase()) {
                case "LARGA":
                    word = new LargeWord(Integer.parseInt(data[0]), data[1]);
                    break;
                case "MEDIANA":
                    word = new MediumWord(Integer.parseInt(data[0]), data[1]);
                    break;
                case "CORTA":
                    word = new ShortWord(Integer.parseInt(data[0]), data[1]);
                    break;
            }

            if (word == null) {
                throw new InvalidWordException("Tipo de palabra no válido: " + data[2]);
            }

            return word;
        } catch (Exception e) {
            throw new InvalidWordException(e.getMessage());
        }
    }

    /*
     Parsea el Id de la palabra si ocurre un error lanza una excepción InvalidIdException
    */
    private int idValidator(String id) throws InvalidIdException {
        int idInt;

        try{
            idInt = Integer.parseInt(id);
        }catch(Exception e){
            throw new InvalidIdException(e.getMessage());
        }

        return idInt;
    }

    /*
    * Valida que la cadena contenga 3 elementos separados por el caracter regex caso contrario lanza una excepción InvalidWordException
     */
    private void sizeValidator(String[] words) throws InvalidWordException {
        if(words.length != this.ELEMENT_COUNT){
            throw new InvalidWordException("Valores de la palabra faltantes");
        }
    }


}
