package base;

public class LargeWord extends Word {
    public LargeWord(int id, String word) {
        super(id, word);
        this.level = "L";
        this.maxTries = 10;
    }
}