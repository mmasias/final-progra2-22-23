// Filename: sizeValidatorTest.java
// package com.progra.test;
//
// import com.progra.hangman.base.MediumWord;
// import com.progra.hangman.base.Word;
// import com.progra.hangman.exceptions.InvalidWordException;
// import com.progra.hangman.parsers.WordParser;
// import org.junit.jupiter.api.DisplayName;
// import org.junit.jupiter.api.Test;
//

import com.progra.hangman.UserInterface;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class sizeValidatorTest {

	//sizeValidatorTest: Debe validar que la cadena de texto al parsearlo deba tener
	// la cantidad de elementos necesarios para crear una instancia de Word.
	@Test
	public void sizeValidatorTest() {
		UserInterface ui = new UserInterface();
		ui.start("data/word-list.txt");
		int expected = 15;

		int actual = ui.sizeListWord();

		assertEquals(expected,actual);
	}
}
