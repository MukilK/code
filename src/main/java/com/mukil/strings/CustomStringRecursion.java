package com.mukil.strings;

public class CustomStringRecursion {


  public boolean isUnique(String input) {
    if (input.equals("") || input.length() == 1) {
      return true;
    }
    int index = 0;

    while (index != input.length()) {
      if (compare(input.charAt(index), input.substring(index + 1))) {
        return false;
      } else {
        index++;
      }

    }
    return true;

  }


  private boolean compare(char character, String subString) {

    if (subString.equals(""))
      return false;

    if (character == subString.charAt(0)) {
      return true;
    } else {
      if (subString.length() == 1) {
        return false;
      } else {
        return compare(character, subString.substring(1));
      }

    }


  }


}
