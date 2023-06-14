package com.progra;

import com.progra.hangman.UserInterface;

public class Main {
    public static void main(String[] args) {
        UserInterface ui = new UserInterface();
        ui.start("data/word-list.txt");
        ui.play();
    }
}