/**
 * Creating An Equal Sum Checker For Strengthening Arithmetic And Comparison
 * Operations
 *
 * Write a method hasEqualSum with 3 parameters of type int.
 *
 * The method should return boolean and it needs to return true if the sum of
 * the first and second parameter is equal to the third parameter. Otherwise,
 * return false.
 *
 *
 *
 * EXAMPLES OF INPUT/OUTPUT:
 *
 * hasEqualSum(1, 1, 1); should return false since 1 + 1 is not equal to 1
 *
 * hasEqualSum(1, 1, 2); should return true since 1 + 1 is equal to 2
 *
 * hasEqualSum(1, -1, 0); should return true since 1 + (-1) is 1 - 1 and is
 * equal to 0
 */

public class EqualSumChecker {
  public static void main(String[] args) {
    // Test various number combinations
    System.out.println("Test 1: hasEqualSum(1, 1, 1) should be false = " + hasEqualSum(1, 1, 1));
    System.out.println("Test 2: hasEqualSum(1, 1, 2) should be true = " + hasEqualSum(1, 1, 2));
    System.out.println("Test 3: hasEqualSum(1, -1, 0) should be true = " + hasEqualSum(1, -1, 0));
    System.out.println("Test 4: hasEqualSum(2, 3, 6) should be false = " + hasEqualSum(2, 3, 6));
    System.out.println("Test 5: hasEqualSum(-1, 1, 0) should be true = " + hasEqualSum(-1, 1, 0));
  }

  public static boolean hasEqualSum(int num1, int num2, int sum) {
    return (boolean) ((num1 + num2) == sum);
  }
}
