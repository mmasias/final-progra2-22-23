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


        if(!validCommas(tokens)) throw new InvalidWordException("Word not valid");
        String[] allTokens = tokens.split(",");
        int id = Integer.parseInt(allTokens[0]);
        String word = allTokens[1];
        String type = allTokens[2];

        if(type.equals("LARGA")) return new LargeWord(id, word);
        else if(type.equals("MEDIANA")) return new MediumWord(id, word);
        else return new ShortWord(id, word);



    }

    private boolean validCommas(String tokens) {
        int counter = 0;
        for(int i = 0; i < tokens.length(); i++){
            if(tokens.charAt(i) == ',') counter++;
        }
        if(counter == 2) return true;
        else return false;
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
            throw new InvalidWordException("WORD NOT VALID");
        }
    }


}
