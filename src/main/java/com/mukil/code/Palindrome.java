package com.mukil.code;

public class Palindrome {

	public Palindrome() {

	}

	public String createPalindrome(String input) {
		int traverseLimit=input.length()-1;
		int initialIndex=0;
		String palindrome=input;
		if (input.equals("")||input.length() == 1||isPalindrome(input)) {
			return input;
		}else{
			
			for (int i=initialIndex;i<traverseLimit;i++){
				if(!(input.charAt(i)==input.charAt(input.length()-i-1))){
					initialIndex=i;
					traverseLimit=input.length()-i-1;
					break;
				}
			}
			
			for (int i=initialIndex;i<=traverseLimit;i++){
				if(!(palindrome.charAt(i)==palindrome.charAt(palindrome.length()-i-1))){
					palindrome=palindrome.substring(0, traverseLimit+1)+palindrome.charAt(i)+palindrome.substring(traverseLimit+1);
				}
			}
			
			
		}
		
		

		return palindrome;
	}

	public boolean isPalindrome(String input) {

		for (int i = 0; i <= input.length() / 2; i++) {
			if (!(input.charAt(i) == input.charAt(input.length() - i-1))) {
				return false;
			}

		}

		return true;
	}

}
