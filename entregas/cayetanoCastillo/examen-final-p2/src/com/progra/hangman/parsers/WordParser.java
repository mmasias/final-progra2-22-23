package com.progra.hangman.parsers;

import com.progra.hangman.base.Word;

public class WordParser {
    String tokens = "9,abdomen,MEDIANA";
    String separator = ",";
    String[] tokensArray = tokens.split(separator);
    

    public WordParser(String tokens, String separator, String[] tokensArray) {
        this.tokens = tokens;
        this.separator = separator;
        this.tokensArray = tokensArray;
    }

    public WordParser(String tokens) {
    }

    public Word parse(String tokens) {
        return null;
    }
}
