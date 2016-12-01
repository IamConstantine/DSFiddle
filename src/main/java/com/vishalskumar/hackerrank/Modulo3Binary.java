package com.vishalskumar.hackerrank;

public class Modulo3Binary {
  public static boolean isDivisibleBy3(int number) {
    int mulitplier = 1;
    int state = 0;
    number = Math.abs(number);
    while (number != 0) {
      state = state + mulitplier * (number & 1);
      number = number >>> 1;
      mulitplier *= -1;
    }
    return state == 0;
  }
}
