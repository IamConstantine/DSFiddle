package com.vishalskumar.hackerrank.utils;

import org.junit.Assert;
import org.junit.Test;

import static com.vishalskumar.hackerrank.utils.Utils.*;

public class UtilsTest {

  @Test
  public void shouldAssertHCF(){
    Assert.assertEquals(1, hcf(13, 1));
    Assert.assertEquals(2, hcf(2, 4));
    Assert.assertEquals(3, hcf(9, 6));
    Assert.assertEquals(1, hcf(13, 29));
  }
  @Test
  public void shouldCountTrailingZeroes(){
    Assert.assertEquals(0, countTrailingZeroes(1));
    Assert.assertEquals(1, countTrailingZeroes(2));
    Assert.assertEquals(0, countTrailingZeroes(9));
    Assert.assertEquals(3, countTrailingZeroes(8));
  }

}