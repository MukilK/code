package com.mukil.code;

public class Palindrome {

  public Palindrome() {

  }

  public String createPalindrome(String input) {

    if (input.equals("") || input.length() == 1 || isPalindrome(input)) {
      return input;
    } else {
      return palindromeConverter(input, 0);

    }
  }

  public String palindromeConverter(String input, int fIndex) {

    if (fIndex >= input.length() - 1 - fIndex) {
      return input;
    } else {
      if (!(input.charAt(fIndex) == input.charAt(input.length() - 1 - fIndex))) {
        return palindromeConverter(
            input.substring(0, input.length() - 1 - fIndex + 1) + input.charAt(fIndex)
                + input.substring(input.length() - 1 - fIndex + 1), fIndex + 1);

      } else {
        return palindromeConverter(input, fIndex + 1);
      }
    }


  }

  public boolean isPalindrome(String input) {

    for (int i = 0; i <= input.length() / 2; i++) {
      if (!(input.charAt(i) == input.charAt(input.length() - i - 1))) {
        return false;
      }
    }
    return true;
  }

}
