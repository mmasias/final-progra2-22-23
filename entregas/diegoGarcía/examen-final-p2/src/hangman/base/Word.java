package hangman.base;

abstract class Word {
    private int id;
    private String word;
    private String level;
    private int maxTries;

    public Word(int id, String word) {
        // Constructor
    }

    public int getId() {
        // Método para obtener el ID
    }

    public String getWord() {
        // Método para obtener la palabra
    }

    public int getLength() {
        // Método para obtener la longitud de la palabra
    }

    public int getMaxTries() {
        // Método para obtener el número máximo de intentos
    }

    public String getLevel() {
        // Método para obtener el nivel de dificultad
    }

    public void toUpperCase() {
        // Método para convertir la palabra a mayúsculas
    }
}

