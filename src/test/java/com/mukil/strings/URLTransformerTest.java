package com.mukil.strings;



import org.junit.Assert;
import org.junit.Test;

import com.mukil.strings.URLTransformer;

public class URLTransformerTest {

  @Test
  public void transformUrlTest() {
    Assert.assertEquals("axy%20bgc%20123", URLTransformer.transformUrl("axy bgc 123    ", 11));
    Assert.assertEquals("%20", URLTransformer.transformUrl("   ", 1));
  }



}
