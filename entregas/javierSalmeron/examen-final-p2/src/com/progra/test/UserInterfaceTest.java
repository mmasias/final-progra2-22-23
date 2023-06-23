package com.progra.test;

import com.progra.hangman.UserInterface;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserInterfaceTest {

    @Test
    @DisplayName("start() should return amount of words loaded")
    void start() {
        UserInterface ui = new UserInterface();
        // word-list.txt contains 15 words
        ui.start("C:\\Users\\Javier\\Downloads\\javaThings\\uneat\\ExamenFinalPrograII\\final-progra2-22-23-main\\entregas\\javierSalmeron\\examen-final-p2\\data\\word-list.txt");
        int expected = 15;

        int actual = ui.sizeListWord();

        assertEquals(expected, actual);
    }


}