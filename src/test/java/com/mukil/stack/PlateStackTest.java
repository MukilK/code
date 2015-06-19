package com.mukil.stack;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class PlateStackTest {

  @Rule
  public ExpectedException thrown = ExpectedException.none();


  @Test
  public void testPlateStack() throws Exception {
    PlateStack pStack = new PlateStack();

    for (int i = 0; i < 15; i++) {
      pStack.push(i);
    }

    for (int i = 14; i >= 0; i--) {
      Assert.assertEquals(i, pStack.pop());
    }
  }


  @Test
  public void testPlateStack100Plus() throws Exception {
    PlateStack pStack = new PlateStack();

    for (int i = 0; i < 102; i++) {
      pStack.push(i);
    }

    for (int i = 101; i >= 0; i--) {
      Assert.assertEquals(i, pStack.pop());
    }
  }

  @Test
  public void testPlateStackPopException() throws Exception {
    thrown.expect(Exception.class);
    PlateStack pStack = new PlateStack();

    for (int i = 0; i < 5; i++) {
      pStack.push(i);
    }

    for (int i = 4; i >= -1; i--) {
      Assert.assertEquals(i, pStack.pop());
    }
  }



}
