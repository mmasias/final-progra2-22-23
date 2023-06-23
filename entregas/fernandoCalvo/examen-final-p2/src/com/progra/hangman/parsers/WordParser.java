package com.progra.hangman.parsers;

import com.progra.hangman.base.LargeWord;
import com.progra.hangman.base.MediumWord;
import com.progra.hangman.base.ShortWord;
import com.progra.hangman.base.Word;
import com.progra.hangman.exceptions.InvalidIdException;
import com.progra.hangman.exceptions.InvalidWordException;

public class WordParser implements Parser {

    String regex;
    final int ELEMENT_COUNT = 3;

    public WordParser() {
        this.regex = ",";
    }

    public WordParser(String regex) {
        this.regex = regex;
    }

    public Word parse(String tokens) throws InvalidWordException {

        /*
         * Tokens es una cadena que contiene la información de una palabra.
         * Valida que la cadena contenga 3 elementos separados por el caracter regex caso contrario lanza una excepción InvalidWordException
         * La cadena debe tener la forma:
         * codigo,palabra,tipo
         * codigo: es un número que identifica la palabra
         * palabra: es la palabra en sí
         * tipo: es el tipo de palabra que es: LARGA, MEDIA o CORTA
         * Dependiendo del tipo crear la instancia de la clase Word correspondiente, que puede ser de la clase WordShort, WordMedium o WordLong
         * */

        String[] words = tokens.split( this.regex );

        //Validamos que el array tenga la cantidad de elementos requeridos
        sizeValidator(words);

        //Validamos que el id sea un numero
        int id = idValidator(words[0]);
        String word = words[1];
        String type = words[2];

        //Dependiento de que tipo de palabra sea, se crea una instancia de la clase correspondiente
        if (type.equals("LARGA")){
            return new LargeWord(id, word);
        } else if (type.equals("MEDIANA")){
            return new MediumWord(id, word);
        } else if (type.equals("CORTA")){
            return new ShortWord(id, word);
        } else {
            throw new InvalidWordException("Tipo de palabra no valido");
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
