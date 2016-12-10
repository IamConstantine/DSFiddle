package com.vishalskumar.hackerrank;

import org.junit.Assert;
import org.junit.Test;

import static com.vishalskumar.hackerrank.MaxPowerOf2DivisorOfGCDOfN.maxPowerOf2DivisorOfGCDOf;

public class MaxPowerOf2DivisorOfGCDOfNTest {

  @Test(expected = AssertionError.class)
  public void shouldThrowAssertionErrorIfTheInputContainsZero() throws Exception {
    maxPowerOf2DivisorOfGCDOf(new int[]{1,0,2,2});
  }

  @Test
  public void shouldReturnMaxPowerOf2DivisorOfGCDOfInput(){
    Assert.assertEquals(1, maxPowerOf2DivisorOfGCDOf(new int[]{2,4}));
    Assert.assertEquals(0, maxPowerOf2DivisorOfGCDOf(new int[]{2,4,3}));
    Assert.assertEquals(2, maxPowerOf2DivisorOfGCDOf(new int[]{8,4}));
  }
}