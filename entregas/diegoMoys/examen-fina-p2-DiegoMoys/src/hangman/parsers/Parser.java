package hangman.parsers;

import hangman.base.Word;
import hangman.exceptions.InvalidWordException;

public interface Parser {
    public Word parse(String tokens) throws InvalidWordException;
}
