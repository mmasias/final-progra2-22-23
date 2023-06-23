package Hangman.Test;

import Hangman.Bases.LargeWord;
import Hangman.Bases.ShortWord;
import Hangman.Bases.Word;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordTest {

    @Test
    @DisplayName("shortWordTest() should return level 'S' as string")
    void shortWordTest() {
        Word word = new ShortWord(1, "Hola");
        assertEquals("S", word.getLevel());
    }

    @Test
    @DisplayName("mediumWordTest() should return level 'M' as string")
    void mediumWordTest() {
        Word word = new LargeWord.MediumWord(1, "Abdomen");
        assertEquals("M", word.getLevel());
    }
}
