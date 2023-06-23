package com.progra.hangman;

import com.progra.hangman.base.Word;

import java.util.List;

public class Userinterface {
    private List<Word> words;
    private int currentWordIndex;
    private boolean gameOver;
    private  HangmanLogic logic;

    public Userinterface() {
    }
    private int ramdomIndex(){
        return (int) (Math.random() * words.size());
    }
    private void loadData(String level){
        for(Word word : words){
            if(word.getLevel().equals(level)){
                word.toUpperCase();
            }
        }
    }
    public void startGame(String level){
        gameOver = false;
        currentWordIndex = ramdomIndex();
        loadData(level);
    }
    public void play(){
        Word currentWord = words.get(currentWordIndex);
        System.out.println("La palabra tiene " + currentWord.getlength() + " letras");
        System.out.println("Tienes " + currentWord.getMaxtries() + " intentos");
    }
    public void printMenu(){
        System.out.println("1. Jugar");
        System.out.println("2. Salir");
    }

}
