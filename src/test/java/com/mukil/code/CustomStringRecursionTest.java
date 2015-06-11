package com.mukil.code;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;


public class CustomStringRecursionTest {

  @Rule
  public ExpectedException thrown=ExpectedException.none();
  
  @Test
  public void testForEmptyString(){
    CustomStringRecursion cStr=new CustomStringRecursion();
    Assert.assertTrue(cStr.isUnique(""));
    
  }
  
  
  @Test
  public void testForNullString(){
    thrown.expect(NullPointerException.class);
    CustomStringRecursion cStr=new CustomStringRecursion();
    cStr.isUnique(null);
    
  }
  
  @Test
  public void testNonUniqueString(){
    CustomStringRecursion cStr=new CustomStringRecursion();
    Assert.assertFalse(cStr.isUnique("axyzvyb"));
    
  }
  
  @Test
  public void testUniqueString(){
    CustomStringRecursion cStr=new CustomStringRecursion();
    Assert.assertTrue(cStr.isUnique("axzvyb"));
    
  }
  
  @Test
  public void testAdjacentRepeatingCharacters(){
    CustomStringRecursion cStr=new CustomStringRecursion();
    Assert.assertFalse(cStr.isUnique("axxzvyb"));
    
  }
  
  @Test
  public void testExtremeEndCharacters(){
    CustomStringRecursion cStr=new CustomStringRecursion();
    Assert.assertFalse(cStr.isUnique("abcdefghijklmnopqrstuvwxz12345678900"));
    
  }
  @Test
  public void testSingleCharString(){
    CustomStringRecursion cStr=new CustomStringRecursion();
    Assert.assertTrue(cStr.isUnique("a"));
    
  }
  
  
  
  
}
