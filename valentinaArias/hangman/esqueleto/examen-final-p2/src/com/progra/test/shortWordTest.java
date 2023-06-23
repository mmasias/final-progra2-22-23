package com.progra.test;

import com.progra.hangman.base.Word;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class shortWordTest {
	//shortWordTest: Al momento de crear una instancia de ShortWord al validar el nivel debe retornar S.
     	@Test
        void shortWordTest() {
			Word word = new ShortWord(1, "Hola");
			assertEquals("S", word.getLevel());
	 	}



}
