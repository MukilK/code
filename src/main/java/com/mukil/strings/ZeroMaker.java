package com.mukil.strings;


public class ZeroMaker {


  public static int[][] makeZero(int[][] arr) {
    boolean[] rowTracker = new boolean[arr.length];
    boolean[] colTracker = new boolean[arr[0].length];;
    int rCounter, cCounter;
    for (rCounter = 0; rCounter < arr.length; rCounter++) {
      for (cCounter = 0; cCounter < arr[0].length; cCounter++) {

        if (arr[rCounter][cCounter] == 0) {
          rowTracker[rCounter] = true;
          colTracker[cCounter] = true;
        }
      }
    }

    for (rCounter = 0; rCounter < rowTracker.length; rCounter++) {
      for (cCounter = 0; cCounter < colTracker.length; cCounter++) {
        if ((rowTracker[rCounter]) || (colTracker[cCounter]))
          arr[rCounter][cCounter] = 0;
      }
    }

    return arr;

  }



}
