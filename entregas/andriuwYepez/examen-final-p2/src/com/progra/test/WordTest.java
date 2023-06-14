package src.com.progra.test;

import src.com.progra.hangman.base.MediumWord;
import src.com.progra.hangman.base.ShortWord;
import src.com.progra.hangman.base.Word;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class WordTest {

    @Test
    @DisplayName("shortWordTest() should return level 'S' as string")
    void shortWordTest() {
        Word word = new ShortWord(1, "Hola");
        assertEquals("S", word.getLevel());
        System.out.println("S");
    }

    @Test
    @DisplayName("mediumWordTest() should return level 'M' as string")
    void mediumWordTest() {
        Word word = new MediumWord(1, "Abdomen");
        assertEquals("M", word.getLevel());
        System.out.println("M");
    }
}