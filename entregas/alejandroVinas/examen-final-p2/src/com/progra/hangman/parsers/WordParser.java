package com.progra.hangman.parsers;

import com.progra.hangman.base.Word;
import com.progra.hangman.exceptions.InvalidIdException;
import com.progra.hangman.exceptions.InvalidWordException;
import com.progra.hangman.base.LongWord;
import com.progra.hangman.base.MediumWord;
import com.progra.hangman.base.ShortWord;


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
        String[] words = tokens.split(regex);
        sizeValidator(words);
        int id = idValidator(words[0]);
        String word = words[1];
        String type = words[2];
        Word word1 = null;
        switch (type){
            case "CORTA":
                word1 = new ShortWord(id,word);
                break;
            case "MEDIA":
                word1 = new MediumWord(id,word);
                break;
            case "LARGA":
                word1 = new LongWord(id,word);
                break;
        }
        return word1;
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
            throw new InvalidWordException("Valores de la palabra faltantes");
        }
    }


}