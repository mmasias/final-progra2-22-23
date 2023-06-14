package Hangman.Bases;

public class ShortWord extends Word {
    public ShortWord(int id, String word) {
        super(id, word);
        this.level = "S";
        this.maxTries=6;
    }
}
