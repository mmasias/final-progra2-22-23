package main.ex1;

public class HangmanLogic {
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
        if (letter.length() != 1) {
            System.out.println("Invalid input! Please enter a single letter.");
            return;
        }

        char guessedLetter = letter.charAt(0);
        if (guessedLetters.contains(String.valueOf(guessedLetter))) {
            System.out.println("You already guessed that letter!");
            return;
        }

        guessedLetters += guessedLetter;
        if (!word.containsLetter(guessedLetter)) {
            numberOfFaults++;
        }
    }

    public boolean isGameOver() {
        return numberOfFaults >= 6;
    }

    public boolean isWon() {
        return word.isWordGuessed(guessedLetters);
    }

    public String getHangman() {
        String hangman = "";
        switch (numberOfFaults) {
            case 0:
                hangman += "  +---+\n";
                hangman += "  |   |\n";
                hangman += "      |\n";
                hangman += "      |\n";
                hangman += "      |\n";
                hangman += "      |\n";
                break;
            case 1:
                hangman += "  +---+\n";
                hangman += "  |   |\n";
                hangman += "  O   |\n";
                hangman += "      |\n";
                hangman += "      |\n";
                hangman += "      |\n";
                break;
            case 2:
                hangman += "  +---+\n";
                hangman += "  |   |\n";
                hangman += "  O   |\n";
                hangman += "  |   |\n";
                hangman += "      |\n";
                hangman += "      |\n";
                break;
            case 3:
                hangman += "  +---+\n";
                hangman += "  |   |\n";
                hangman += "  O   |\n";
                hangman += " /|   |\n";
                hangman += "      |\n";
                hangman += "      |\n";
                break;
            case 4:
                hangman += "  +---+\n";
                hangman += "  |   |\n";
                hangman += "  O   |\n";
                hangman += " /|\\  |\n";
                hangman += "      |\n";
                hangman += "      |\n";
                break;
            case 5:
                hangman += "  +---+\n";
                hangman += "  |   |\n";
                hangman += "  O   |\n";
                hangman += " /|\\  |\n";
                hangman += " /    |\n";
                hangman += "      |\n";
                break;
            case 6:
                hangman += "  +---+\n";
                hangman += "  |   |\n";
                hangman += "  O   |\n";
                hangman += " /|\\  |\n";
                hangman += " / \\  |\n";
                hangman += "      |\n";
                break;
        }
        return hangman;
    }

    public String hiddenWord() {
        StringBuilder hidden = new StringBuilder();
        for (char letter : word.getOriginalWord().toCharArray()) {
            if (guessedLetters.contains(String.valueOf(letter))) {
                hidden.append(letter);
            } else {
                hidden.append("_");
            }
        }
        return hidden.toString();
    }
}
