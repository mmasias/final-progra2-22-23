package hangman.parsers;

import hangman.base.Word;
import hangman.exceptions.InvalidWordException;

public interface Parser {
    Word parse(String data) throws InvalidWordException;

}
