package com.secure.SpringSecurity.forTesting;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ForString {

	
	@Autowired
	private isPalindromeOrNot isPalindromeOrNot;
	
	@Test
	public void testIsPalindromeOrNot_ValidPalindrome() {
		var res = isPalindromeOrNot.isPalindrome("malayalam");
		Assertions.assertTrue(res);
	}
	
}
