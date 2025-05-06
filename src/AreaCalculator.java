/**
 * Constructing A Comprehensive Area Calculator For Circles And Rectangles In
 * Java
 *
 * Write a method named area with one double parameter named radius.
 *
 * The method needs to return a double value that represents the area of a
 * circle.
 *
 * If the parameter radius is negative then return -1.0 to represent an invalid
 * value.
 *
 * Write another overloaded method with 2 parameters x and y (both doubles),
 * where x and y represent the sides of a rectangle.
 *
 * The method needs to return an area of a rectangle.
 *
 * If either or both parameters is/are a negative return -1.0 to indicate an
 * invalid value.
 *
 * For formulas and PI value please check the tips below.
 *
 * Examples of input/output:
 *
 * area(5.0); should return 78.53981633974483 or 78.53981
 *
 * area(-1); should return -1 since the parameter is negative
 *
 * area(5.0, 4.0); should return 20.0 (5 * 4 = 20)
 *
 * area(-1.0, 4.0); should return -1 since first the parameter is negative
 *
 *
 */
public class AreaCalculator {
  public static void main(String[] args) {
    // Test circle area calculations
    System.out.println("Circle area with radius 5.0 = " + area(5.0));
    System.out.println("Circle area with radius -1.0 = " + area(-1.0));

    // Test rectangle area calculations
    System.out.println("Rectangle area with length=5.0, width=4.0 = " + area(5.0, 4.0));
    System.out.println("Rectangle area with length=-1.0, width=4.0 = " + area(-1.0, 4.0));
  }

  public static double area(double radius) {
    if (radius < 0) {
      return -1;
    }

    return Math.PI * radius * radius;
  }

  public static double area(double length, double width) {
    if (length < 0 || width < 0) {
      return -1;
    }

    return length * width;
  }
}
