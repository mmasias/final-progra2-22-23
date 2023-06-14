package entregas.joseSalceda.ahorcado.com.progra.test;

import entregas.joseSalceda.ahorcado.com.progra.hangman.base.Word;
import entregas.joseSalceda.ahorcado.com.progra.hangman.parsers.WordParser;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import entregas.joseSalceda.ahorcado.com.progra.hangman.exceptions.*;
import entregas.joseSalceda.ahorcado.com.progra.hangman.base.*;


class WordParserTest {

    @Test
    @DisplayName("nameParsedTest() should create a Word object with word 'abdomen'")
    void nameParsedTest() {
        String tokens = "9,abdomen,MEDIANA";
        WordParser wordParser = new WordParser(",");
        Word word = null;
        try {
            word = wordParser.parse(tokens);
        } catch (InvalidWordException e) {
            throw new RuntimeException(e);
        }
        assertEquals("abdomen", word.getWord());
    }

    @Test
    @DisplayName("instanceParsedTest() should create an instance of MediumWord")
    void instanceParsedTest() {
        String tokens = "9,abdomen,MEDIANA";
        WordParser wordParser = new WordParser(",");
        Word word = null;
        try {
            word = wordParser.parse(tokens);
        } catch (InvalidWordException e) {
            throw new RuntimeException(e);
        }
        assertInstanceOf(MediumWord.class, word);
    }


    @Test
    @DisplayName("sizeValidator() Exception message when size is invalid")
    void sizeValidatorTest() {
        InvalidWordException thrown = assertThrows(InvalidWordException.class, () -> {
            String tokens = "9,abdomen";
            WordParser wordParser = new WordParser(",");
            Word word = wordParser.parse(tokens);
        });

        assertEquals("Word not valid, Valores de la palabra faltantes", thrown.getMessage());
    }

}