package base;

public abstract class Word {
    private int id;
    private String word;
    protected String level;
    protected int maxTries;

    public Word(int id, String word) {
        this.id = id;
        this.word = word;
        this.level = "ND";
        this.maxTries = 3;
    }

    public int getId() {
        return this.id;
    }

    public String getWord() {
        return this.word;
    }

    public int getLength() {
        return this.word.length();
    }

    public int getMaxTries() {
        return this.maxTries;
    }

    public String getLevel() {
        return this.level;
    }

    public void toUpperCase() {
        this.word = this.word.toUpperCase();
    }
}