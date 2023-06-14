package hangman.test;

import hangman.HangmanLogic;
import hangman.base.MediumWord;
import hangman.base.Word;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class HangmanLogicTest {

    @Test
    void testIsGameOver_WordNotGuessed_MaxTriesReached() {
        Word word = new MediumWord(1, "apple");
        HangmanLogic logic = new HangmanLogic(word);
        logic.guessLetter("z");
        logic.guessLetter("x");
        logic.guessLetter("y");
        logic.guessLetter("w");
        logic.guessLetter("q");
        logic.guessLetter("r");
        logic.guessLetter("t");

        assertTrue(logic.isGameOver());
    }

    @Test
    void testIsGameOver_WordGuessed() {
        Word word = new MediumWord(1, "apple");
        HangmanLogic logic = new HangmanLogic(word);
        logic.guessLetter("a");
        logic.guessLetter("p");
        logic.guessLetter("l");
        logic.guessLetter("e");

        assertTrue(logic.isGameOver());
    }

    @Test
    void testIsGameOver_WordNotGuessed_UnderMaxTries() {
        Word word = new MediumWord(1, "apple");
        HangmanLogic logic = new HangmanLogic(word);
        logic.guessLetter("z");
        logic.guessLetter("x");
        logic.guessLetter("y");
        logic.guessLetter("w");
        logic.guessLetter("q");

        assertFalse(logic.isGameOver());
    }

    @org.junit.jupiter.api.Test
    void testIsWon_Won() {
        Word word = new MediumWord(1, "apple");
        HangmanLogic logic = new HangmanLogic(word);
        logic.guessLetter("a");
        logic.guessLetter("p");
        logic.guessLetter("l");
        logic.guessLetter("e");

        assertTrue(logic.isWon());
    }

}