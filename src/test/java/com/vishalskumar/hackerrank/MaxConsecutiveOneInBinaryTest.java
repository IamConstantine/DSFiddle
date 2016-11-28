package com.vishalskumar.hackerrank;

import org.junit.Assert;
import org.junit.Test;

import static com.vishalskumar.hackerrank.MaxConsecutiveOneInBinary.maxConsecutiveOneInBinaryNumber;

public class MaxConsecutiveOneInBinaryTest {
  @Test
  public void shouldReturnOneIfFive(){
    Assert.assertEquals(1, maxConsecutiveOneInBinaryNumber(5));
  }
  @Test
  public void shouldReturnTwoIfThirteen(){
    Assert.assertEquals(2, maxConsecutiveOneInBinaryNumber(13));
  }
}