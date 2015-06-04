package com.mukil.code;

import org.junit.Assert;
import org.junit.Test;

public class PalindromeConverterTest {

	
	@Test
	public void emptyStringTest(){
	Palindrome palindrome=new Palindrome();
	Assert.assertEquals("", palindrome.createPalindrome(""));
	
	}
	
	@Test
	public void oneCharStringTest(){
		Palindrome palindrome=new Palindrome();
		Assert.assertEquals("a", palindrome.createPalindrome("a"));
	}
	

	@Test
	public void palindromeInputTest(){
		Palindrome palindrome=new Palindrome();
		Assert.assertEquals("abcba", palindrome.createPalindrome("abcba"));
	}
	
	
	@Test
	public void stringToBeConvertedTest(){
		Palindrome palindrome=new Palindrome();
		Assert.assertEquals("abcba", palindrome.createPalindrome("abc"));
	}
	
	@Test
	public void string2ToBeConvertedTest(){
		Palindrome palindrome=new Palindrome();
		Assert.assertEquals("abcba", palindrome.createPalindrome("abca"));
	}
	@Test
	public void string3ToBeConvertedTest(){
		Palindrome palindrome=new Palindrome();
		Assert.assertEquals("abcdcba", palindrome.createPalindrome("abcd"));
	}
}
