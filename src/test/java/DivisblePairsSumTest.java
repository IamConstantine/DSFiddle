import org.junit.Assert;
import org.junit.Test;

import static com.vishalskumar.hackerrank.DivisblePairsSum.findDivisiblePairsSum;

public class DivisblePairsSumTest {

  @Test
  public void shouldAssertFiveDivisiblePairs(){
    int []arr = new int[]{1, 3, 2, 6, 1, 2};
    int divisiblePairsSum = findDivisiblePairsSum(3, arr);
    Assert.assertEquals(5, divisiblePairsSum);
  }

  @Test
  public void shouldAssertNineDivisiblePairs(){
    int []arr = new int[]{1, 3, 2, 6, 1, 2, 4, 1,3};
    int divisiblePairsSum = findDivisiblePairsSum(4, arr);
    Assert.assertEquals(9, divisiblePairsSum);
  }
}