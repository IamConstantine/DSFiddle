package com.vishalskumar.hackerrank;

import java.util.Arrays;
import java.util.stream.Collectors;

import static com.vishalskumar.hackerrank.utils.Utils.countTrailingZeroes;

public class MaxPowerOf2DivisorOfGCDOfN {
  public static int maxPowerOf2DivisorOfGCDOf(int[] numbers) {
    assert !Arrays.stream(numbers).boxed().collect(Collectors.toList()).contains(0) : "No Zeroes allowed";

    int min = Integer.MAX_VALUE;
    for (int number : numbers) {
      min = Math.min(min, countTrailingZeroes(number));
      if (min == 0)
        break;
    }
    return min;
  }
}
