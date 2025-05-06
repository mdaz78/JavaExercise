/**
 *
 * Developing A 'Barking Dog' Program For Boolean Logic Familiarity We have a
 * dog that likes to bark. We need to wake up if the dog is barking at night!
 *
 * Write a method shouldWakeUp that has 2 parameters.
 *
 * 1st parameter should be of type boolean and be named barking it represents if
 * our dog is currently barking. 2nd parameter represents the hour of the day
 * and is of type int with the name hourOfDay and has a valid range of 0-23.
 *
 * We have to wake up if the dog is barking before 8 or after 22 hours so in
 * that case return true.
 *
 * In all other cases return false.
 *
 * If the hourOfDay parameter is less than 0 or greater than 23 return false.
 *
 * Examples of input/output:
 *
 * shouldWakeUp (true, 1); → should return true
 *
 * shouldWakeUp (false, 2); → should return false since the dog is not barking.
 *
 * shouldWakeUp (true, 8); → should return false, since it's not before 8.
 *
 * shouldWakeUp (true, -1); → should return false since the hourOfDay parameter
 * needs to be in a range 0-23.
 *
 */
public class BarkingDog {
    public static void main(String[] args) {
        // Test case 1: Dog is barking at night (should wake up)
        System.out.println("Test case 1: Dog barking at night (3 AM)");
        System.out.println("Should we wake up? " + shouldWakeUp(true, 3));

        // Test case 2: Dog is barking but during the day (should not wake up)
        System.out.println("\nTest case 2: Dog barking during day (2 PM)");
        System.out.println("Should we wake up? " + shouldWakeUp(true, 14));

        // Test case 3: Dog is not barking at night (should not wake up)
        System.out.println("\nTest case 3: Dog not barking at night");
        System.out.println("Should we wake up? " + shouldWakeUp(false, 2));

        // Test case 4: Invalid hour
        System.out.println("\nTest case 4: Invalid hour (-1)");
        System.out.println("Should we wake up? " + shouldWakeUp(true, -1));

        // Test case 5: Edge case - exactly 8 AM
        System.out.println("\nTest case 5: Edge case - 8 AM");
        System.out.println("Should we wake up? " + shouldWakeUp(true, 8));
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }

        return (hourOfDay < 8 || hourOfDay > 22) && barking;
    }
}
