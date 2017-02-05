package com.vishalskumar.hackerrank;

import org.junit.Test;

import static com.vishalskumar.hackerrank.MajorityElement.findMajorityElement;
import static org.junit.Assert.assertEquals;

public class MajorityElementTest {

  @Test
  public void testFindMajorityElement() throws Exception {
    int[] arr = new int[]{2, 2, 3, 5, 2, 2, 6};
    assertEquals(2, findMajorityElement(arr));

    arr = new int[]{3, 3, 4, 2, 4, 4, 2, 4, 4};
    assertEquals(4, findMajorityElement(arr));

    arr = new int[]{3, 3, 4, 2, 4, 4, 2, 4};
    assertEquals(-1, findMajorityElement(arr));
  }
}