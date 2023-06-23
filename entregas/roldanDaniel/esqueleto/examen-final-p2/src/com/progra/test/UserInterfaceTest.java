package com.progra.test;

import com.progra.hangman.UserInterface;
import exceptions.InvalidWordException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

class UserInterfaceTest {

    @Test
    @DisplayName("start() should return amount of words loaded")
    void start() throws InvalidWordException, FileNotFoundException {
        UserInterface ui = new UserInterface();
        // word-list.txt contains 15 words
        ui.start("entregas/roldanDaniel/esqueleto/examen-final-p2/data/word-list.txt");
        int expected = 15;

        int actual = ui.sizeListWord();

        assertEquals(expected, actual);
    }


}



