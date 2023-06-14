package com.progra.hangman.parsers;

import com.progra.hangman.base.LargeWord;
import com.progra.hangman.base.MediumWord;
import com.progra.hangman.base.ShortWord;
import com.progra.hangman.base.Word;
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

        String[] words = tokens.split(this.regex);
        if(words[2] == "CORTA") {
            try {
                return new ShortWord(this.idValidator(words[0]), words[1]);
            } catch (InvalidIdException e) {
                System.err.println(e.getMessage());
            }
        } else if (words[2]== "MEDIANA"){
            try {
                return new MediumWord(this.idValidator(words[0]), words[1]);
            } catch (InvalidIdException e) {
                System.err.println(e.getMessage());
            }
        } else if (words[2]== "LARGA"){
            try {
                return new LargeWord(this.idValidator(words[0]), words[1]);
            } catch (InvalidIdException e) {
                System.err.println(e.getMessage());
            }
        } else {
            throw new InvalidWordException("Tipo de palabra no válida");
        }
        return null;
    }

    /*
     Parsea el Id de la palabra si ocurre un error lanza una excepción InvalidIdException
    */
    private int idValidator(String id) throws InvalidIdException {
        int idInt;

        idInt = Integer.parseInt(id);

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
