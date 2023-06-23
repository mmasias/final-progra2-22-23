package parser;


import base.Word;
import exceptions.InvalidWordException;

public interface Parser {
    public Word parse (String tokens) throws InvalidWordException;
}
