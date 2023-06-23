package com.progra.hangman.parsers;

import com.progra.hangman.base.*;
import com.progra.hangman.base.LongWord;
import com.progra.hangman.base.MediumWord;
import com.progra.hangman.base.ShortWord;
import com.progra.hangman.exceptions.*;



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
        sizeValidator(words);
        int id = idValidator(words[0]);
        String wordStr = words[1];
        String type = words[2]; 

        switch (type) {
            case "LARGA":
                return new LongWord(id, wordStr);
            case "MEDIANA":
                return new MediumWord(id, wordStr);
            case "CORTA":
                return new ShortWord(id, wordStr);
            default:
                throw new InvalidWordException("Invalid word type");
        } 
    }

    private int idValidator(String id) throws InvalidWordException {
        int idInt;
        try {
            idInt = Integer.parseInt(id);
        } catch(Exception e) {
            throw new InvalidWordException("Invalid id in word: " + id);
        }
        return idInt;
    }

    private void sizeValidator(String[] words) throws InvalidWordException {
        if(words.length != this.ELEMENT_COUNT){
            throw new InvalidWordException("Word not valid, Valores de la palabra faltantes");
        }
    }
}
