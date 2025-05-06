/**
 * Building A Decimal Comparator To Practice Floating-Point Comparisons In Java
 * Write a method areEqualByThreeDecimalPlaces with two parameters of type
 * double.
 *
 * The method should return boolean and it needs to return true if two double
 * numbers are the same up to three decimal places. Otherwise, return false.
 *
 *
 *
 * EXAMPLES OF INPUT/OUTPUT:
 *
 * areEqualByThreeDecimalPlaces(-3.1756, -3.175); → should return true since
 * numbers are equal up to 3 decimal places.
 *
 * areEqualByThreeDecimalPlaces(3.175, 3.176); → should return false since
 * numbers are not equal up to 3 decimal places
 *
 * areEqualByThreeDecimalPlaces(3.0, 3.0); → should return true since numbers
 * are equal up to 3 decimal places.
 *
 * areEqualByThreeDecimalPlaces(-3.123, 3.123); → should return false since
 * numbers are not equal up to 3 decimal places.
 */

public class DecimalComparator {
  public static void main(String[] args) {
    // Test cases with various decimal numbers
    System.out.println("Test 1: areEqualByThreeDecimalPlaces(-3.1756, -3.175) should be true = " +
        areEqualByThreeDecimalPlaces(-3.1756, -3.175));

    System.out.println("Test 2: areEqualByThreeDecimalPlaces(3.175, 3.176) should be false = " +
        areEqualByThreeDecimalPlaces(3.175, 3.176));

    System.out.println("Test 3: areEqualByThreeDecimalPlaces(3.0, 3.0) should be true = " +
        areEqualByThreeDecimalPlaces(3.0, 3.0));

    System.out.println("Test 4: areEqualByThreeDecimalPlaces(-3.123, 3.123) should be false = " +
        areEqualByThreeDecimalPlaces(-3.123, 3.123));
  }

  public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
    long firstNumber = (long) (num1 * 1000);
    long secondNumber = (long) (num2 * 1000);

    return firstNumber == secondNumber;
  }
}
