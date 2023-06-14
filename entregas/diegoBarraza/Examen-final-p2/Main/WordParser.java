package Main;

import com.progra.hangman.base.Word;

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

    public Word parse(String tokens) throws InvalidWordException, InvalidIdException {
        String[] words = tokens.split(this.regex);
        sizeValidator(words);
        int id = idValidator(words[0]);
        String word = words[1];
        String type = words[2];
        Word wordObj = null;
        switch (type) {
            case "LARGA":
                LargeWord largeWord = new LargeWord(word, id);
                break;
            case "MEDIA":
                MediumWord mediumWord= new MediumWord(word,id);
                break;
            case "CORTA":
                ShortWord shortWord = new ShortWord(word,id);
                break;
            default:
                throw new InvalidWordException("Word type not found");
        }

        /*
         * Tokens es una cadena que contiene la información de una palabra.
         * Se encarga de validar que la cadena contenga 3 elementos separados por el caracter regex caso contrario lanza una excepción Main.HangmanLogic.InvalidWordException
         * La cadena debe tener la forma:
         * codigo,palabra,tipo
         * codigo: es un número que identifica la palabra
         * palabra: es la palabra en sí
         * tipo: es el tipo de palabra que es: LARGA, MEDIA o CORTA
         * Dependiendo del tipo crear la instancia de la clase Main.Word correspondiente, que puede ser de la clase WordShort, WordMedium o WordLong
         * */
        return wordObj;
    }



    /*
     Parsea el Id de la palabra si ocurre un error lanza una excepción Main.InvalidIdException
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
     * Valida que la cadena contenga 3 elementos separados por el caracter regex caso contrario lanza una excepción Main.HangmanLogic.InvalidWordException
     */
    private void sizeValidator(String[] words) throws InvalidWordException {
        if(words.length != this.ELEMENT_COUNT){
            throw new InvalidWordException("Valores de la palabra faltantes");
        }
    }


}
