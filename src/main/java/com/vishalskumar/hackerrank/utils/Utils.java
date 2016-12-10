package com.vishalskumar.hackerrank.utils;

public class Utils {
  //Euclid's Algo
  public static int hcf(int a, int b) {
    if (b == 0) return a;
    return hcf(b, a % b);
  }

  public static int countTrailingZeroes(int number) {
    if (number == 0) {
      return -1;
    }
    int cnt = 0;
    while ((number & 1) == 0) {
      cnt++;
      number = number >> 1;
    }
    return cnt;
  }


}
