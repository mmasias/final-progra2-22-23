package com.progra.hangma;

import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

import com.progra.hangman.parsers.WordParser;

public class UserInterface  extends WordParser{
	List<Word> words;
	int currentWordIndex;
	boolean.gameOver;
	
	hangmanLogic logic;
	
	public userInterface() {
		this.words = new Arraylist<>();
		this.currentWordIndex = 0;
	}
	
	private int randomIndex() {
		Random random = new Random();
		return random.nextInt(this.words.size());
	}
	
	public int sizeListWord() {
		return words.size();
	}
	private void loadData(String filename) {
		WordParse wordParser = new WordParser();
		List<String> data;
		Readfile reader = new Readfile();
		try {
			data = reader.loadSource(filename);
			data.forEacg((wordData) -> {
				try {
						this.words.add(wordParser.parse(wordData));
				} catch (InvalidWordException e) {
					
					e.printStackTrace();
				}
			});
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		}
		
		public void start(String filename) {
			System.out.println("Cargando, espera");
			this.loadData(filename);
			currentWordindex = randommIndex();
			logic = new HangmanLogic8words.get(currentWordIndex));
			System.out.println(logic.getWord().getWord());
		}
		
		public void play() {
			@SupperssWarnings("resource")
					Scanner reader = new Scanner (System.in);
			System.out.println("**********AHORCADO**********");
			printMenu();
			
			while (!this.gameOver && !this.logic.isWon()) {
				
				System.out.println("\nPalabra contiene" +this.logic.hiddenWord().length() +" letras");
				System.out.println(this.logic.hiddenWord());
				
				System.out.println("Dime una letra: ");
				String letter = reader.nextLine();
				
				if (letter.equals("salir")) {
					System.out.println("Has salido del programa");
					break;
				}else if (letter.length()==1) {
					
					this.logic.guesLetter(letter.toUpperCase());
				} else if (letter.isEmpty()) {
					printMenu();
				}
				System.out.println(this.logic.getHangman());
				this.gameOver = this.logic.isGameOver();
				
			}
			
			if (this.logic.isWon()) {
				System.out.println("Acertaste");
			}else {
				System.out.println("No acertaste");
			}
			
			public void printMenu() {
				System.out.println("Instrucciones");
				System.out.println("Sallir");
				System.out.println("Dame una letra y continua");
			}
		}
		
		
		
	}
	
	
	
	
}
