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
    // Test case 1: Equal numbers
    System.out.println("Test case 1: Equal numbers (3.175 vs 3.175)");
    System.out.println("Are they equal? " + areEqualByThreeDecimalPlaces(3.175, 3.175));

    // Test case 2: Different numbers beyond 3 decimal places
    System.out.println("\nTest case 2: Different beyond 3 decimals (3.1756 vs 3.1757)");
    System.out.println("Are they equal? " + areEqualByThreeDecimalPlaces(3.1756, 3.1757));

    // Test case 3: Different numbers within first 3 decimals
    System.out.println("\nTest case 3: Different within 3 decimals (3.123 vs 3.124)");
    System.out.println("Are they equal? " + areEqualByThreeDecimalPlaces(3.123, 3.124));

    // Test case 4: Negative numbers
    System.out.println("\nTest case 4: Negative numbers (-3.123 vs -3.123)");
    System.out.println("Are they equal? " + areEqualByThreeDecimalPlaces(-3.123, -3.123));

    // Test case 5: Mixed positive and negative
    System.out.println("\nTest case 5: Mixed signs (3.123 vs -3.123)");
    System.out.println("Are they equal? " + areEqualByThreeDecimalPlaces(3.123, -3.123));
  }

  public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
    long firstNumber = (long) (num1 * 1000);
    long secondNumber = (long) (num2 * 1000);

    return firstNumber == secondNumber;
  }
}
