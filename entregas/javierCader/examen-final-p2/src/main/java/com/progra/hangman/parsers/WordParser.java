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
        String[] words = tokens.split(this.regex);
        sizeValidator(words);

        int id = idValidator(words[0]);
        String word = words[1];
        String level = words[2];

        Word wordObj = switch (level) {
            case "LARGA" -> new LargeWord(id, word);
            case "MEDIANA" -> new MediumWord(id, word);
            case "CORTA" -> new ShortWord(id, word);
            default -> throw new InvalidWordException("Tipo de palabra inválida");
        };

        return wordObj;
    }

    private int idValidator(String id) throws InvalidIdException {
        int idInt;

        try{
            idInt = Integer.parseInt(id);
        }catch(Exception e){
            throw new InvalidIdException(e.getMessage());
        }

        return idInt;
    }

    private void sizeValidator(String[] words) throws InvalidWordException {
        if(words.length != this.ELEMENT_COUNT){
            throw new InvalidWordException("Word not valid, Valores de la palabra faltantes");
        }
    }
}
