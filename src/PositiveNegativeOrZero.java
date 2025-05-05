/*
    Comprehensive 'Positive, Negative, Or Zero' Assessment In Java
    Write a method called checkNumber with an int parameter named number.

    The method should not return any value, and it needs to print out:

    - "positive" if the parameter number is > 0
    - "negative" if the parameter number is < 0
    - "zero" if the parameter number is equal to 0
 */

public class PositiveNegativeOrZero {
    public static void main(String[] args) {
    }

    public static void checkNumber(int number) {
        if (number > 0) {
            System.out.println("positive");
        } else if (number < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }
    }

}
