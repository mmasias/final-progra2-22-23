package com.progra.hangman.parsers;

import com.progra.hangman.exceptions.InvalidWordException;
import com.progra.hangman.exceptions.InvalidIdException;
import com.progra.hangman.base.Word;
public class WordParser implements Parser {

    String regex;
    int ELEMENT_COUNT;

    public WordParser() {
        this.regex = ",";
    }

    public WordParser(String regex) {
        this.regex = regex;
    }

    public Word parse(String tokens) throws InvalidWordException {
        if(!validCommas(tokens)) throw new InvalidWordException("Word not valid, Valores de la palabra faltantes");
        String[] allTokens = tokens.split(",");
        int id = Integer.parseInt(allTokens[0]);
        String word = allTokens[1];
        String type = allTokens[2];

        if(type.equals("LARGA")) return new com.progra.hangman.base.LargeWord(id, word);
        else if(type.equals("MEDIANA")) return new com.progra.hangman.base.MediumWord(id, word);
        else if(type.equals("CORTA")) return new com.progra.hangman.base.ShortWord(id, word);
        throw new com.progra.hangman.exceptions.InvalidWordException("INVALID, TRY AGAIN");
    }

    private boolean validCommas(String tokens) {
        int counter = 0;
        for(int i = 0; i < tokens.length(); i++){
            if(tokens.charAt(i) == ',') counter++;
        }
        if(counter == 2)
            return true;
        else
            return false;
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
            throw new InvalidWordException("[     INPUT ERROR, TRY AGAIN     ]");
        }
    }


}
