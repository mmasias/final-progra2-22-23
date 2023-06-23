package com.progra.hangman;

import com.progra.hangman.base.Word;
import com.progra.hangman.parsers.Parser;
import static org.junit.jupiter.api.Assertions.*;

class HangmanLogicTest {

    @org.junit.jupiter.api.Test
    void isGameOver() {
        HangmanLogic hangmanLogic = new HangmanLogic(new Word(5, "hello"));
        hangmanLogic.isGameOver();
        assertEquals(0, hangmanLogic.numberOfFaults());
    }

    @org.junit.jupiter.api.Test
    void isWon() {
        HangmanLogic hangmanLogic = new HangmanLogic(new Word(5, "hello"));
        hangmanLogic.isWon();
        assertEquals(0, hangmanLogic.numberOfFaults());

    }
}