package com.progra.test;

import com.progra.hangman.base.MediumWord;
import com.progra.hangman.base.ShortWord;
import com.progra.hangman.base.Word;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

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
        Word word = new MediumWord(1, "Abdomen");
        assertEquals("M", word.getLevel());
    }
}