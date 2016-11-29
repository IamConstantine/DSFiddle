package com.vishalskumar.hackerrank.utils;

public class Utils {
  //Euclid's Algo
  public static int hcf(int a, int b) {
    if (b == 0) return a;
    return hcf(b, a % b);
  }
}
