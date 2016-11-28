package com.vishalskumar.hackerrank;

public class DivisblePairsSum {
  public static int findDivisiblePairsSum(int k, int arr[]) {
    int count=0;

    int []freq = new int[k];
    for (int number : arr) {
      freq[number%k]++;
    }
    count+=freq[0]*(freq[0]-1)/2; // nC2 = n!/2!*(n-2)! = n*(n-1)/2

    int i;
    for(i=1;i<Math.ceil(freq.length)/2;i++){
      count+=freq[i]*freq[k-i];
    }
    if(0==k%2) count+=freq[k/2]*(freq[k/2]-1)/2;
    return count;
  }
}
