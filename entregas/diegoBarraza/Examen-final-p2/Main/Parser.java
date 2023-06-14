package Main;

import com.progra.hangman.base.Word;




public interface Parser {
        public Word parse(String tokens) throws InvalidWordException, InvalidIdException;
    }

