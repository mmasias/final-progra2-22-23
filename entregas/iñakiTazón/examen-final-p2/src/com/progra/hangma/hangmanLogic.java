package com.progra.hangma;

import com.progra.hangman.base.Word;

public class hangmanLogic extends Word{
	
	private Word word;
	private String guessedLetters;
	private int numberOfFaults;
	
	public HangmanLogic(Word word) {
		this.word = word;
		this.word.toUpperCase();
		this.guessedLetters = "";
		this.numberOfFaults = 0;
	}
	public Word getWord() {
		return this.word;
	}
	
	public int numberOfFaullts() {
		return this.numberOfFaults;
	}
	
	public String guessedLetters() {
		return this.guessedLetters;
	}
	
	public void guessedLetters(Sting letter) {
		
	}
	
	public boolean isGameOver() {
		
		return false;
	}
	
	public boolean isWon() {
		
		return false;
	}
	
	public String getHangman() {
		String hangman = "";
		switch (numberOfFaults) {
		 case 1:
             hangman = "\n" + "\n|" + "\n|" + "\n|" + "\n|" + "\n|" + "\n|_______________________\n";
             break;
         case 2:
             hangman = "\n_________" + "\n|" + "\n|" + "\n|" + "\n|" + "\n|" + "\n|_______________________\n";
             break;
         case 3:
             hangman = "\n_________" + "\n|                   |" + "\n|" + "\n|" + "\n|" + "\n|" + "\n|_______________________\n";
             break;
         case 4:
             hangman = "\n_________" + "\n|                   |" + "\n|                  O" + "\n|" + "\n|" + "\n|" + "\n|_______________________\n";
             break;
         case 5:
             hangman = "\n_________" + "\n|                   |" + "\n|                  O" + "\n|                   |" + "\n|" + "\n|" + "\n|_______________________\n";
             break;
         case 6:
             hangman = "\n_________" + "\n|                   |" + "\n|                  O" + "\n|               ---|" + "\n|" + "\n|" + "\n|_______________________\n";
             break;
         case 7:
             hangman = "\n_________" + "\n|                   |" + "\n|                  O" + "\n|               ---|---" + "\n|" + "\n|" + "\n|_______________________\n";
             break;
         case 8:
             hangman = "\n_________" + "\n|                   |" + "\n|                  O" + "\n|               ---|---" + "\n|                  /" + "\n|                /" + "\n|_______________________\n";
             break;
		}
		
		if (numberOfFaults >= word.getMaxTries()) {
			hangman = ("\n_________\" + \"\\n|                   |\" + \"\\n|                  O\" + \"\\n|               ---|---\" + \"\\n|                  /\" + \"\\n|                /\" + \"\\n|_______________________n\");
		
		}
		return hangman;
	}
	
	public String hiddenWord() {
		
		System.out.println(this.word.getWord());
		char[] result = (this.word.getWord()).toCharArray();
		String resultPrinted = "";
		for(char resultLetter : result) {
			if(this.guessedLetters.indexOf(resultLetter) == 0) {
				resultPrinted += "-";
			}
			return resultPrinted;
		}
	}
}
