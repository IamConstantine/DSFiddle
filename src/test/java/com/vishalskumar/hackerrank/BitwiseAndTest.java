package com.vishalskumar.hackerrank;

import org.junit.Assert;
import org.junit.Test;

import static com.vishalskumar.hackerrank.BitwiseAnd.*;

public class BitwiseAndTest {

  @Test
  public void shouldReturnOne(){
    Assert.assertEquals(1, bitwiseAnd(5, 2));
  }
  @Test
  public void shouldReturnFour(){
    Assert.assertEquals(4, bitwiseAnd(8, 5));
  }
  @Test
  public void shouldReturnZero(){
    Assert.assertEquals(0, bitwiseAnd(2, 2));
  }

}