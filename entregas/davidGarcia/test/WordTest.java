package test;

import base.MediumWords;
import base.ShortWords;
import base.Word;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordTest {

    @Test
    @DisplayName("shortWordTest() should return level 'S' as string")
    void shortWordTest() {
        Word word = new ShortWords(1, "Hello");
        assertEquals("ND", word.getLevel());
    }

    @Test
    @DisplayName("mediumWordTest() should return level 'M' as string")
    void mediumWordTest() {
        Word word = new MediumWords(1, "sierra");
        assertEquals("ND", word.getLevel());
    }
}