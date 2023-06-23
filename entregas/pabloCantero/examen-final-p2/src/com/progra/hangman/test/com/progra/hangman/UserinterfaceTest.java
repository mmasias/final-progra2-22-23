package com.progra.hangman;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserinterfaceTest {

    @Test
    void startGame() {
        Userinterface userinterface = new Userinterface();
        userinterface.startGame();
        assertEquals(0, userinterface.numberOfFaults());
    }
}