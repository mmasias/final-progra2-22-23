package com.progra.hangman.parsers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordParserTest {

    @Test
    void parse() {
        WordParser wordParser = new WordParser();
        wordParser.parse("hola");
        assertEquals(0, wordParser.parse("hola"));
    }
}