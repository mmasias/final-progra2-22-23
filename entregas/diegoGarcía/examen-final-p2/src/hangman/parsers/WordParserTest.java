package hangman.parsers;

import hangman.base.MediumWord;
import hangman.base.Word;
import hangman.exceptions.InvalidWordException;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class WordParserTest {

    @Test
    void testNameParser() throws InvalidWordException {
        WordParser parser = new WordParser();
        String input = "1;apple";
        Word word = parser.parse(input);
        assertEquals(1, word.getId());
        assertEquals("apple", word.getWord());
    }

    @Test
    void testInstanceParsed() throws InvalidWordException {
        WordParser parser = new WordParser();
        String input = "1;apple";
        Word word = parser.parse(input);
        assertTrue(word instanceof MediumWord);
    }

    @Test
    void testSizeValidator() throws InvalidWordException {
        WordParser parser = new WordParser();
        String[] validInput = {"1", "apple"};
        String[] invalidInput = {"1"};
        assertFalse(parser.sizeValidator(Arrays.toString(invalidInput)));
    }

}