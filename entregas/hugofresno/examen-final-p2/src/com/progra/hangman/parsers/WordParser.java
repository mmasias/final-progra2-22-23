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
        this.regex = ",";
    }

    public WordParser(String regex) {
        this.regex = regex;
    }

    public Word parse(String tokens) throws InvalidWordException {

        String[] line= tokens.split(regex);

        int id = Integer.parseInt(line[0]);
        String word = line[1];
        String level = line[2];
        if (level.equalsIgnoreCase("corta")){
            ShortWord shortWord = new ShortWord(id,word);
            return shortWord;
        } else if (level.equalsIgnoreCase("mediana")) {
            MediumWord mediumWord = new MediumWord(id,word);
            return mediumWord;
        } else if (level.equalsIgnoreCase("larga")){
            LargeWord largeWord = new LargeWord(id,word);
            return largeWord;
        } else {

        }



        /*
        * Tokens es una cadena que contiene la información de una palabra.
        * Valida que la cadena contenga 3 elementos separados por el caracter regex caso contrario lanza una excepción InvalidWordException
        * La cadena debe tener la forma:
        * codigo, palabra,tipo
        * codigo: es un número que identifica la palabra
        * palabra: es la palabra en sí
        * tipo: es el tipo de palabra que es: LARGA, MEDIA o CORTA
        * Dependiendo del tipo crear la instancia de la clase Word correspondiente, que puede ser de la clase WordShort, WordMedium o WordLong
        * */

        return null;
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
    private void sizeValidator(String[] words)  {

        try{
            if(words.length != this.ELEMENT_COUNT){}
        }catch (Exception e){

        }
    }


}
