package com.mukil.strings;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import com.mukil.strings.StringPermutation;

public class StringPermutationTest {


	@Test
	public void emptyStringTest(){
	Assert.assertEquals(0,StringPermutation.getAllPermutations("").size());
	
	}
	
	@Test
	public void nullStringTest(){
	Assert.assertEquals(0,StringPermutation.getAllPermutations(null).size());
	
	}
	
	@Test
	public void uniqueStringTest(){
		
	ArrayList<String> expectedList= new ArrayList<String>();
	expectedList.add("ab");
	expectedList.add("ba");
		
	Assert.assertEquals(expectedList,StringPermutation.getAllPermutations("ab"));
	
	}
	
	@Test
	public void threeCharacterStringTest(){
		
	ArrayList<String> expectedList= new ArrayList<String>();
	expectedList.add("cab");
	expectedList.add("acb");
	expectedList.add("abc");
	expectedList.add("cba");
	expectedList.add("bca");
	expectedList.add("bac");
	Assert.assertEquals(expectedList,StringPermutation.getAllPermutations("abc"));
	
	}
	

	
	@Test
    public void permutationsTest(){
        
    Assert.assertTrue(StringPermutation.isPermutation("bca", "abc"));
    
    }
	
	
    
	
	
	
	
}
