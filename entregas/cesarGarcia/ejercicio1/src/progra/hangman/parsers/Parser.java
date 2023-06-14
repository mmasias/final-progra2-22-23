package cesarGarcia.ejercicio1.src.progra.hangman.parsers;

import cesarGarcia.ejercicio1.src.progra.hangman.exceptions.InvalidWordException;
import cesarGarcia.ejercicio1.src.progra.hangman.base.Word;

public interface Parser {
    public Word parse(String tokens) throws InvalidWordException;
}
