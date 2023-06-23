package base;

public abstract class Word {
    private int id;
    private String word;
    protected String level;
    protected int maxTries;

    public Word(int id, String word) {
        this.id = id;
        this.word = word;
        this.maxTries = 3;
        this.level = "ND";
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
        return level;
    }

    public void toUpperCase() {
        word = word.toUpperCase();
    }

}
