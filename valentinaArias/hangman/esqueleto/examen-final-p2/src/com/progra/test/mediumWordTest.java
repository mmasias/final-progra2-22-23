package com.progra.test;

import org.junit.jupiter.api.Test;

public class mediumWordTest {

	@Test
	void mediumWordTest() {
		Word word = new MediumWord(1, "Abdomen");
		assertEquals("M", word.getLevel());
	}


}
