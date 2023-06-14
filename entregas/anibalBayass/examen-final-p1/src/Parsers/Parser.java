package Parsers;

import base.Word;
import Exceptions.InvalidIdException;

public interface Parser {
    Word parse(String var1) throws InvalidIdException;
}