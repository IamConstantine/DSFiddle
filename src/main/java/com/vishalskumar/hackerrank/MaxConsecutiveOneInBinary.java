package com.vishalskumar.hackerrank;

public class MaxConsecutiveOneInBinary {

  public static int maxConsecutiveOneInBinaryNumber(int number) {
    int count = 0;
    int max = 0;
    while (number != 0) {
      if ((number & 1) == 1) {
        count++;
      } else {
        max = Math.max(count, max);
        count = 0;
      }
      number = number >> 1;
    }
    return Math.max(count, max);
  }
}
