package main.ex1;

public class WordParser implements Parser {
    private String regex;
    private int ELEMENT_COUNT;

    public WordParser() {
        regex = ",";
        ELEMENT_COUNT = 2;
    }

    public WordParser(String regex, int elementCount) {
        this.regex = regex;
        this.ELEMENT_COUNT = elementCount;
    }

    public Word parse(String wordData) {
        String[] parts = wordData.split(regex);

        if (parts.length != ELEMENT_COUNT) {
            throw new IllegalArgumentException("Invalid word data format");
        }

        int id = idValidator(parts[0].trim());
        String word = parts[1].trim();

        return new Word(id, word);
    }

    public int idValidator(String idStr) {
        try {
            int id = Integer.parseInt(idStr);
            if (id <= 0) {
                throw new IllegalArgumentException("Invalid ID");
            }
            return id;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid ID format");
        }
    }

    public void sizeValidator(String[] parts) {
        if (parts.length != ELEMENT_COUNT) {
            throw new IllegalArgumentException("Invalid number of elements");
        }
    }
}
