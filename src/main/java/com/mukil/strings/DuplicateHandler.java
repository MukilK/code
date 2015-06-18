package com.mukil.strings;

import java.util.Arrays;

import com.mukil.exceptions.ArrayNotSortedException;


public class DuplicateHandler {

  private int[] duplicates;

  public void setDuplicates(int[] duplicates) {
    this.duplicates = duplicates;
  }


  public int[] removeDuplicates() throws ArrayNotSortedException {
    int counter = 1;
    int tracker = 0;
    if (duplicates == null) {
      throw new NullPointerException();

    }

    if ((duplicates.length <= 1)) {
      return duplicates;
    }

    while (counter < duplicates.length) {
      if (duplicates[tracker] > duplicates[counter])
        throw new ArrayNotSortedException("The array is unsorted " + duplicates[tracker]
            + " appears before " + "duplicates[counter]");

      if (duplicates[tracker] == duplicates[counter]) {
        counter++;
      } else {
        duplicates[++tracker] = duplicates[counter++];
      }
    }
    return Arrays.copyOfRange(duplicates, 0, tracker + 1);

  }



}
