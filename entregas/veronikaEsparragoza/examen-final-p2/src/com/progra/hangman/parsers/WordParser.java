package com.progra.hangman.parsers;
import com.progra.hangman.base.*;
import com.progra.hangman.exceptions.InvalidIdException;
import com.progra.hangman.exceptions.InvalidWordException;

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
        try {
            this.sizeValidator(tokens.split(this.regex));
            int id = Integer.parseInt(tokens.split(this.regex)[0]);
            String wordName = tokens.split(this.regex)[1];
            String type = tokens.split(this.regex)[2];
            System.out.println(tokens.split(this.regex)[2]);
            switch (type) {
                case "CORTA":
                    return new ShortWord(id, wordName);
                case "MEDIA":
                    return new MediumWord(id, wordName);
                case "LARGA":
                    return new LargeWord(id, wordName);
                default:
                    throw new InvalidWordException("Word not valid");
            }
        }catch (InvalidWordException e) {
            throw new InvalidWordException(e.getMessage() + "Word not valid");
        }
    }


 /*       } catch (InvalidWordException e) {
            throw new InvalidWordException(e.getMessage());
        }
        return null;*/




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
