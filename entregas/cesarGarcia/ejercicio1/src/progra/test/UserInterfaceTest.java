package cesarGarcia.ejercicio1.src.progra.test;

import cesarGarcia.ejercicio1.src.progra.hangman.UserInterface;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserInterfaceTest {

    @Test
    @DisplayName("start() should return amount of words loaded")
    void start() {
        UserInterface ui = new UserInterface();
        // word-list.txt contains 15 words
        ui.start("entregas/cesarGarcia/ejercicio1/data/word-list.txt");
        int expected = 15;

        int actual = ui.sizeListWord();

        assertEquals(expected, actual);
    }


}