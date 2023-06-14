package Hangman.Bases;

public class LargeWord extends Word {
    public LargeWord(int id, String word) {
        super(id, word);
        this.level = "L";
        this.maxTries = 10;
    }

public static class MediumWord extends LargeWord {
        public MediumWord(int id, String word) {
            super(id, word);
            this.level = "M";
            this.maxTries = 7;
        }
    }
}
