package com.vishalskumar.hackerrank;

public class MajorityElement {
  //Find Element which appear more than n/2 times
  //Moore's Voting Algorithm
  public static int findMajorityElement(int arr[]) {
    int majorityElement = findCandidate(arr);
    return isMajority(arr, majorityElement) ? majorityElement : -1;
  }

  private static boolean isMajority(int[] arr, int majorityElement) {
    int count = 0;
    for (int n : arr) {
      if (n == majorityElement)
        count++;
      if (count > arr.length/2)
        return true;
    }
    return false;
  }

  private static int findCandidate(int[] arr) {
    int majorityElementIndex = 0;
    int count = 1;
    for (int i = 1; i < arr.length; i++) {
      if (arr[majorityElementIndex] == arr[i])
        count++;
      else {
        count--;
        if (count == 0) {
          majorityElementIndex = i;
          count = 1;
        }
      }
    }
    return arr[majorityElementIndex];
  }
}
