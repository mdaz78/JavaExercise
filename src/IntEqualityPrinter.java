/**
 * Crafting An Equality Printer To Explore Multiple Conditional Checks In Java
 *
 * Write a method printEqual with 3 parameters of type int. The method should
 * not return anything (void).
 *
 * If one of the parameters is less than 0, print text "Invalid Value".
 *
 * If all numbers are equal print text "All numbers are equal"
 *
 * If all numbers are different print text "All numbers are different".
 *
 * Otherwise, print "Neither all are equal or different".
 *
 *
 *
 * EXAMPLES OF INPUT/OUTPUT:
 *
 * printEqual(1, 1, 1); should print text All numbers are equal
 *
 * printEqual(1, 1, 2); should print text Neither all are equal or different
 *
 * printEqual(-1, -1, -1); should print text Invalid Value
 *
 * printEqual(1, 2, 3); should print text All numbers are different
 */
public class IntEqualityPrinter {
  public static void main(String[] args) {
    System.out.println("Test 1: printEqual(1, 1, 1):");
    printEqual(1, 1, 1);

    System.out.println("\nTest 2: printEqual(1, 1, 2):");
    printEqual(1, 1, 2);

    System.out.println("\nTest 3: printEqual(-1, -1, -1):");
    printEqual(-1, -1, -1);

    System.out.println("\nTest 4: printEqual(1, 2, 3):");
    printEqual(1, 2, 3);

    System.out.println("\nTest 5: printEqual(2, 2, 2):");
    printEqual(2, 2, 2);
  }

  public static void printEqual(int n1, int n2, int n3) {
    if (n1 < 0 || n2 < 0 || n3 < 0) {
      System.out.println("Invalid Value");
    } else if (n1 == n2 && n1 == n3) {
      System.out.println("All numbers are equal");
    } else if (n1 != n2 && n2 != n3 && n1 != n3) {
      System.out.println("All numbers are different");
    } else {
      System.out.println("Neither all are equal or different");
    }
  }
}
