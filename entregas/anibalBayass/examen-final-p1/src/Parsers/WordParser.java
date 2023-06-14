package Parsers;

import base.LargeWord;
import base.MediumWord;
import base.ShortWord;
import base.Word;
import Exceptions.InvalidIdException;

import java.util.Objects;

public class WordParser implements Parser {
    String regex;
    final int ELEMENT_COUNT = 3;

    public WordParser() {
        this.regex = ",";
    }

    public WordParser(String regex) {
        this.regex = regex;
    }

    public Word parse(String tokens) throws InvalidIdException {
        String[] words = tokens.split(this.regex);
        this.sizeValidator(words);
        int id = this.idValidator(words[0]);
        String word = words[1];
        String type = words[2];
        if (type.equals("LARGA")) {
            return new LargeWord(id, word);
        } else if (type.equals("MEDIANA")) {
            return new MediumWord(id, word);
        } else if (type.equals("CORTA")) {
            return new ShortWord(id, word);
        } else {
            throw new InvalidIdException("Tipo de palabra no valido");
        }
    }

    private int idValidator(String id) throws InvalidIdException {
        try {
            int idInt = Integer.parseInt(id);
            return idInt;
        } catch (Exception var4) {
            throw new InvalidIdException(var4.getMessage());
        }
    }

    private void sizeValidator(String[] words) throws InvalidIdException {
        int var10000 = words.length;
        Objects.requireNonNull(this);
        if (var10000 != 3) {
            throw new InvalidIdException("Valores de la palabra faltantes");
        }
    }
}
