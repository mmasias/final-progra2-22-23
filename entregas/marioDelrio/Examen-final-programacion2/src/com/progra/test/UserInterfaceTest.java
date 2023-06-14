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
        ui.start("C:\\Users\\PORTATIL_MSI\\Documents\\Examen Final Programacion-2\\esqueleto\\examen-final-p2\\data\\word-list.txt");//con la ruta dada por el profesor no me pasa el test por lo cual he cambiado la ruta a la de mi ordenador
        int expected = 15;

        int actual = ui.sizeListWord();

        assertEquals(expected, actual);
    }


}