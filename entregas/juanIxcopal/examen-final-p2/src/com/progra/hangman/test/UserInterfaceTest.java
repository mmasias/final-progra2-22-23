package com.progra.hangman.test;

import com.progra.hangman.UserInterface;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserInterfaceTest {

    @Test
    @DisplayName("start() should return amount of words loaded")
    void start() throws com.progra.hangman.exceptions.InvalidWordException, java.io.FileNotFoundException {
        UserInterface ui = new UserInterface();
        // word-list.txt contains 15 words
        ui.start("data/word-list.txt");
        int expected = 15;

        int actual = ui.sizeListWord();

        assertEquals(expected, actual);
    }


}