package com.mukil.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import org.junit.Test;

public class StringPermutation {

	public static ArrayList<String> getAllPermutations(String inputString) {

		ArrayList<String> allStrings = new ArrayList<String>();
		if (inputString == null || inputString.equals("")) {
			return allStrings;
		}
		if (inputString.length() == 1) {
			allStrings.add(inputString);
			return allStrings;
		}
		return createPermutations(inputString);
	}

	private static ArrayList<String> createPermutations(String inputString) {

		ArrayList<String> subStrings ;
		ArrayList<String> permutatedStrings = new ArrayList<String>();
		if (inputString.length() > 2) {

			subStrings = createPermutations(inputString.substring(0,
					inputString.length() - 1));

			char lastCharacter = inputString.charAt(inputString.length() - 1);
			
			for (String str : subStrings) {
				for (int i = 0; i <= str.length(); i++) {
					permutatedStrings.add(str.substring(0, i) + lastCharacter
							+ str.substring(i, str.length()));
				}
			}
		
		}else{
			permutatedStrings.add(""+inputString.charAt(0)+inputString.charAt(1));
			permutatedStrings.add(""+inputString.charAt(1)+inputString.charAt(0));
		}
		
		return permutatedStrings;

	}

	public static boolean isPermutation(String first,String second){
	  
	  if (first.length()!=second.length()){
	    return false;
	  }
	  
	  int[] firstStringTracker=new int[256];
	  int[] secondStringTracker=new int[256];
	  
	  for (int counter=0;counter<first.length();counter++){
	    firstStringTracker[(int)first.charAt(counter)]=++firstStringTracker[(int)first.charAt(counter)];
	    secondStringTracker[(int)second.charAt(counter)]=++secondStringTracker[(int)second.charAt(counter)];
	    
	  }
	  
	  return Arrays.equals(firstStringTracker,secondStringTracker);
	    
	  
	}
}
