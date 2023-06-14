import Hangman.UserInterface;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        UserInterface ui = new UserInterface();
        ui.start("C:\\Users\\MI PC\\Documents\\Github\\anibalBayas\\entregas\\anibalBayass\\examen-final-p1\\Data\\word-list.txt");
        ui.play();
    }
}
