package hangman;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class UserInterfaceTest {
    @Test
    void testStart_LoadWordsFromFile() throws IOException {
        String filePath = "data/word-list.txt";

        UserInterface ui = new UserInterface();
        ui.start(filePath);

        assertEquals(3, ui.words.size());
        assertEquals("apple", ui.words.get(0).getWord());
        assertEquals("banana", ui.words.get(1).getWord());
        assertEquals("cherry", ui.words.get(2).getWord());

    }

}