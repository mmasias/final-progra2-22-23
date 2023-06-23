package hangman.test;

import hangman.base.MediumWord;
import hangman.base.ShortWord;
import hangman.base.Word;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordTest {
    @Test
    void testShortWordGetLevel() {
        Word word = new ShortWord(1, "cat");
        assertEquals("S", word.getLevel());
    }

    @Test
    void testMediumWordGetLevel() {
        Word word = new MediumWord(2, "elephant");
        assertEquals("M", word.getLevel());
    }

}