package com.vishalskumar.hackerrank.utils;

import org.junit.Assert;
import org.junit.Test;

public class UtilsTest {

  @Test
  public void shouldAssertHCF(){
    Assert.assertEquals(1, Utils.hcf(13, 1));
    Assert.assertEquals(2, Utils.hcf(2, 4));
    Assert.assertEquals(3, Utils.hcf(9, 6));
    Assert.assertEquals(1, Utils.hcf(13, 29));
  }

}