package hangman;

import hangman.base.Word;

class HangmanLogic {
    private Word word;
    private String guessedLetters;
    private int numberOfFaults;

    public HangmanLogic(Word word) {
        this.word = word;
        guessedLetters = "";
        numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return numberOfFaults;
    }

    public String guessedLetters() {
        return guessedLetters;
    }

    public void guessLetter(String letter) {
        char guess = letter.toLowerCase().charAt(0);
        guessedLetters += guess;

        if (word.getWord().indexOf(guess) == -1) {
            numberOfFaults++;
        }
    }

    public boolean isGameOver() {
        return numberOfFaults >= word.getMaxTries() || isWon();
    }

    public boolean isWon() {
        String hiddenWord = hiddenWord();
        return hiddenWord.indexOf('_') == -1 && hiddenWord.length() > 0;
    }

    public String getWord() {
        return word.getWord();
    }

    public String hiddenWord() {
        String targetWord = word.getWord().toLowerCase();
        StringBuilder hidden = new StringBuilder();

        for (char c : targetWord.toCharArray()) {
            if (Character.isLetter(c)) {
                if (guessedLetters.indexOf(c) != -1) {
                    hidden.append(c);
                } else {
                    hidden.append('_');
                }
            } else {
                hidden.append(c);
            }
            hidden.append(' ');
        }

        return hidden.toString().trim();
    }

    public int getMaxTries() {
        return word.getMaxTries();
    }
}
