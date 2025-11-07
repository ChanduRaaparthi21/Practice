package com.secure.SpringSecurity.forTesting;

import org.springframework.stereotype.Service;

@Service
public class isPalindromeOrNot {

	
	public boolean isPalindrome(String input) {
		
		String reversed = new StringBuilder(input).reverse().toString();
		return reversed.equals(input);
		
	}
	
}
