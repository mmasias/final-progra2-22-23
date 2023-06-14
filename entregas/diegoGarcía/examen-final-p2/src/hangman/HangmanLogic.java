package hangman;

class HangmanLogic {
    private Word word;
    private String guessedLetters;
    private int numberOfFaults;

    public HangmanLogic(Word word) {
        // Constructor
    }

    public int numberOfFaults() {
        // Método para obtener el número de fallos
    }

    public String guessedLetters() {
        // Método para obtener las letras adivinadas
    }

    public void guessLetter(String letter) {
        // Método para adivinar una letra
    }

    public boolean isGameOver() {
        // Método para verificar si el juego ha terminado
    }

    public boolean isWon() {
        // Método para verificar si se ha ganado el juego
    }

    public String getHangman() {
        // Método para obtener el dibujo del ahorcado
    }

    public String hiddenWord() {
        // Método para obtener la palabra oculta
    }
}
