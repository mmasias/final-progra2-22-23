package com.progra.hangman.parsers;
import com.progra.hangman.base.Word;
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

    }

    private int idValidator(String id) throws InvalidWordException {
        int idInt;

        try{
            idInt = Integer.parseInt(id);
        }catch(Exception e){
            throw new InvalidWordException(e.getMessage());
        }

        return idInt;
    }
    private void sizeValidator(String[] words) throws InvalidWordException {
        if(words.length != this.ELEMENT_COUNT){
            throw new InvalidWordException("Valores de la palabra faltantes");
        }
    }


}
