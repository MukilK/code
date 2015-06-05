package com.mukil.code;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.mukil.exceptions.ArrayNotSortedException;

public class DuplicateHandlerTest {

  @Rule
  public ExpectedException thrown=ExpectedException.none();
  
  @Test
  public void testNoDuplicates() throws ArrayNotSortedException{
    DuplicateHandler dhandler=new DuplicateHandler();
    int[] dupes={1,2,3,4,5};
    dhandler.setDuplicates(dupes);
    Assert.assertArrayEquals(dupes, dhandler.removeDuplicates());
  }
  
  @Test
  public void testWithDuplicates() throws ArrayNotSortedException{
    DuplicateHandler dhandler=new DuplicateHandler();
    int[] dupes={1,2,3,3,4,4,5};
    int[] noDupes={1,2,3,4,5};
    dhandler.setDuplicates(dupes);
    Assert.assertArrayEquals(noDupes, dhandler.removeDuplicates());
  }
  
  @Test
  public void testEmptyArray() throws ArrayNotSortedException{
    DuplicateHandler dhandler=new DuplicateHandler();
    int[] dupes={};
    int[] noDupes={};
    dhandler.setDuplicates(dupes);
    Assert.assertArrayEquals(noDupes, dhandler.removeDuplicates());
  }
  
  @Test
  public void testWithNull() throws ArrayNotSortedException{
    thrown.expect(NullPointerException.class);
    DuplicateHandler dhandler=new DuplicateHandler();
    dhandler.removeDuplicates();
  }
  
  @Test
  public void testWithSingleElement() throws ArrayNotSortedException{
    DuplicateHandler dhandler=new DuplicateHandler();
    int[] dupes={1};
    int[] noDupes={1};
    dhandler.setDuplicates(dupes);
    Assert.assertArrayEquals(noDupes, dhandler.removeDuplicates());
  }
  @Test
  public void testWithUnsortedArray() throws ArrayNotSortedException{
    thrown.expect(ArrayNotSortedException.class);
    
    DuplicateHandler dhandler=new DuplicateHandler();
    int[] dupes={100,5,4,1,200,300};
    dhandler.setDuplicates(dupes);
    dhandler.removeDuplicates();
    
    
  }
  
  @Test
  public void testWithHappyPath() throws ArrayNotSortedException{
    
    DuplicateHandler dhandler=new DuplicateHandler();
    int[] dupes={0,1,2,3,3,4,4,5,5,30,100};
    int[] noDupes={0,1,2,3,4,5,30,100};
    dhandler.setDuplicates(dupes);
    Assert.assertArrayEquals(noDupes, dhandler.removeDuplicates());
    
  }
  
  @Test
  public void testWithNegativeNumbers() throws ArrayNotSortedException{
    
    DuplicateHandler dhandler=new DuplicateHandler();
    int[] dupes={-5,-4,-3,-3,0,1,2};
    int[] noDupes={-5,-4,-3,0,1,2};
    dhandler.setDuplicates(dupes);
    Assert.assertArrayEquals(noDupes, dhandler.removeDuplicates());
    
  }
  
  @Test
  public void testWithSameNumbers() throws ArrayNotSortedException{
    
    DuplicateHandler dhandler=new DuplicateHandler();
    int[] dupes={0,0,0,0,0,0,0};
    int[] noDupes={0};
    dhandler.setDuplicates(dupes);
    Assert.assertArrayEquals(noDupes, dhandler.removeDuplicates());
    
  }

}
