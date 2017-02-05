package com.vishalskumar.hackerrank;

import org.junit.Test;

import static com.vishalskumar.hackerrank.SparshBitCount.setBitCount;
import static org.junit.Assert.assertEquals;

public class SparshBitCountTest {

  @Test
  public void testBitCount() throws Exception {
    assertEquals(1, setBitCount(8));
    assertEquals(3, setBitCount(7));
  }
}