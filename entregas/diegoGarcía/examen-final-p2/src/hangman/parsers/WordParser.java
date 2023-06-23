package hangman.parsers;

import hangman.base.MediumWord;
import hangman.base.Word;
import hangman.exceptions.InvalidIdException;
import hangman.exceptions.InvalidWordException;

public class WordParser implements Parser {
    private String regex;
    private static final int ELEMENT_COUNT = 2;

    public WordParser() {
        this.regex = "\\d+;[a-zA-Z]+";
    }

    public WordParser(String regex) {
        this.regex = regex;
    }

    @Override
    public Word parse(String data) throws InvalidWordException {
        String[] parts = data.split(";");
        if (parts.length == ELEMENT_COUNT) {
            int id = idValidator(parts[0]);
            String word = parts[1].toLowerCase();
            sizeValidator(word);
            return new MediumWord(id, word);
        } else {
            try {
                throw new InvalidWordException("Formato de palabra inválido: " + data);
            } catch (InvalidWordException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private int idValidator(String idStr) {
        try {
            int id = Integer.parseInt(idStr);
            if (id <= 0) {
                throw new InvalidIdException("ID debe ser un número entero positivo.");
            }
            return id;
        } catch (NumberFormatException e) {
            throw new InvalidIdException("ID inválido: " + idStr);
        }
    }

    public boolean sizeValidator(String word) throws InvalidWordException {
        if (word.isEmpty()) {
            throw new InvalidWordException("La palabra no puede estar vacía.");
        }
        return false;
    }
    }

