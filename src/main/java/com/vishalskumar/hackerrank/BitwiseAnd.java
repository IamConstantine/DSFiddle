package com.vishalskumar.hackerrank;

public class BitwiseAnd {
  public static int bitwiseAnd(int n, int k) {
    int max = 0;
    for (int i = 1; i < n; i++) {
      for (int j = i + 1; j <= n; j++) {
        int iAndJ = i & j;
        if (iAndJ == k - 1) {
          return k - 1;
        }
        max = Math.max(max, iAndJ<k ? iAndJ : 0);
      }
    }
    return max;
  }
}
