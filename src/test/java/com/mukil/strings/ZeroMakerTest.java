package com.mukil.strings;

import org.junit.Assert;
import org.junit.Test;

import com.mukil.strings.ZeroMaker;

public class ZeroMakerTest {

  @Test
  public void zerotest(){
      Assert.assertArrayEquals(new int[][]{{1,0,3},{1,0,3},{1,0,3},{1,0,3},{0,0,0},{1,0,3}},ZeroMaker.makeZero(new int[][]{{1,2,3},{1,2,3},{1,2,3},{1,2,3},{1,0,3},{1,2,3}}));
  }
}
