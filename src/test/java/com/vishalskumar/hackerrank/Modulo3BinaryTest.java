package com.vishalskumar.hackerrank;

import org.junit.Assert;
import org.junit.Test;

import static com.vishalskumar.hackerrank.Modulo3Binary.isDivisibleBy3;

public class Modulo3BinaryTest {

  @Test
  public void testIsDivisibleBy3() throws Exception {
    Assert.assertEquals(true, isDivisibleBy3(3));
    Assert.assertEquals(true, isDivisibleBy3(9));
    Assert.assertEquals(true, isDivisibleBy3(30));
    Assert.assertEquals(true, isDivisibleBy3(-30));
  }
}