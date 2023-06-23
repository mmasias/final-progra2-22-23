package com.progra.test;

import com.progra.hangman.UserInterface;
import com.progra.hangman.exceptions.InvalidWordException;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;

class UserInterfaceTest {

    @Test
    @DisplayName("start() should return amount of words loaded")
    void start() throws FileNotFoundException, InvalidWordException{
        UserInterface ui = new UserInterface();
        // word-list.txt contains 15 words
        ui.start("data/word-list.txt");
        int expected = 15;

        int actual = ui.sizeListWord();

        assertEquals(expected, actual);
    }


}