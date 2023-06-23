package entregas.joseSalceda.ahorcado.com.progra.hangman.parsers;

import entregas.joseSalceda.ahorcado.com.progra.hangman.base.Word;
import entregas.joseSalceda.ahorcado.com.progra.hangman.exceptions.InvalidWordException;

public interface Parser {
    public Word parse(String tokens) throws InvalidWordException;
}