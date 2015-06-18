package com.mukil.strings;


public class URLTransformer {

  public static String transformUrl(String withSpaces, int actualLength) {
    int counter = 0;
    int lenTrack = actualLength - 1;
    char[] transformArray = withSpaces.toCharArray();
    for (counter = withSpaces.length() - 1; counter >= 0; counter--) {
      if (transformArray[lenTrack] != ' ') {
        transformArray[counter] = transformArray[lenTrack];

      } else {
        
        
        transformArray[counter] = '0';
        transformArray[--counter] = '2';
        transformArray[--counter] = '%';

      }
      lenTrack--;
    }
    return new String(transformArray);
  }
}
