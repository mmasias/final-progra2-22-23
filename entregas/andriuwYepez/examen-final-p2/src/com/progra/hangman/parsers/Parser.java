package src.com.progra.hangman.parsers;

import src.com.progra.hangman.base.Word;
import src.com.progra.hangman.exceptions.InvalidWordException;

public interface Parser {
    public Word parse(String tokens) throws InvalidWordException;
}
