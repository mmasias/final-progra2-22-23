package test;


import base.MediumWords;
import base.Word;
import exceptions.InvalidWordException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import parser.WordParser;

import static org.junit.jupiter.api.Assertions.*;

class WordParserTest {

    @Test
    @DisplayName("nameParsedTest() should create a Word object with word 'abdomen'")
    void nameParsedTest() {
        String tokens = "8,sierra,MEDIANA";
        WordParser wordParser = new WordParser(",");
        Word word = null;
        try {
            word = wordParser.parse(tokens);
        } catch (InvalidWordException e) {
            throw new RuntimeException(e);
        }
        assertEquals("sierra", ((Word) word).getWord());
    }

    @Test
    @DisplayName("instanceParsedTest() should create an instance of MediumWord")
    void instanceParsedTest() {
        String tokens = "8,sierra,MEDIANA";
        WordParser wordParser = new WordParser(",");
        Word word = null;
        try {
            word = wordParser.parse(tokens);
        } catch (InvalidWordException e) {
            throw new RuntimeException(e);
        }
        assertInstanceOf(MediumWords.class, word);
    }


    @Test
    @DisplayName("sizeValidator() Exception message when size is invalid")
    void sizeValidatorTest() {
        InvalidWordException thrown = assertThrows(InvalidWordException.class, () -> {
            String tokens = "8,sierra";
            WordParser wordParser = new WordParser(",");
            Word word = wordParser.parse(tokens);
        });

        assertEquals("Word not valid, Valores de la palabra faltantes", thrown.getMessage());
    }

}