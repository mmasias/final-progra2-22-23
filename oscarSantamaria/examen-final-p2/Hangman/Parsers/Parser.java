package Hangman.Parsers;

import Hangman.InvalidWordException;
import Hangman.Bases.Word;

public interface Parser {
    public Word parse(String tokens) throws InvalidWordException;
}
