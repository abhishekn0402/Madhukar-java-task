package com.Numbertoword.pkg;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class JUnitTest {

	@Test
	void test1() {
		String word1 = Convertnumberintowords.conversion(100000000);
		assertEquals("ten crore ", word1);
	}
	
	@Test
	void test2() {
		String word2 = Convertnumberintowords.conversion(-101);
		assertEquals("pass number in between (0 - 100000000)", word2);
	}
	
	@Test 
	void test3() {
		String word3 = Convertnumberintowords.conversion(100000001);
		assertEquals("pass number in between (0 - 100000000)", word3);
	}

}
