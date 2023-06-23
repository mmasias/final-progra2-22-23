package hangman.base;

public abstract class Word {
    private int id;
    private String word;
    private String level;
    private int maxTries;

    public Word(int id, String word) {
        this.id = id;
        this.word = word;
        this.level = "";
        this.maxTries = 7;
    }

    public int getId() {
        return id;
    }

    public String getWord() {
        return word;
    }

    public int getLength() {
        return word.length();
    }

    public int getMaxTries() {
        return maxTries;
    }

    public String getLevel() {
        int length = getLength();
        if (length <= 5) {
            return "S";
        } else if (length <= 9) {
            return "M";
        } else {
            return "L";
        }
    }
}

