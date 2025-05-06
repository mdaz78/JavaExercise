/**
 * Designing A 'Playing Cat' Logic Program To Refine Conditional Implementation
 *
 * The cats spend most of the day playing. In particular, they play if the
 * temperature is between 25 and 35 (inclusive). Unless it is summer, then the
 * upper limit is 45 (inclusive) instead of 35.
 *
 * Write a method isCatPlaying that has 2 parameters. Method needs to return
 * true if the cat is playing, otherwise return false
 *
 * 1st parameter should be of type boolean and be named summer it represents if
 * it is summer.
 * 2nd parameter represents the temperature and is of type int with the name
 * temperature.
 *
 * EXAMPLES OF INPUT/OUTPUT:
 *
 * isCatPlaying(true, 10); should return false since temperature is not in range
 * 25 - 45
 *
 * isCatPlaying(false, 36); should return false since temperature is not in
 * range 25 - 35 (summer parameter is false)
 *
 * isCatPlaying(false, 35); should return true since temperature is in range 25
 * - 35
 */
public class PlayingCat {
  public static void main(String[] args) {
    // Test case 1: Summer, temperature too low
    System.out.println("Test 1: isCatPlaying(true, 10) should be false = " + isCatPlaying(true, 10));

    // Test case 2: Not summer, temperature too high
    System.out.println("Test 2: isCatPlaying(false, 36) should be false = " + isCatPlaying(false, 36));

    // Test case 3: Not summer, temperature in range
    System.out.println("Test 3: isCatPlaying(false, 35) should be true = " + isCatPlaying(false, 35));

    // Additional test cases
    System.out.println("Test 4: isCatPlaying(true, 45) should be true = " + isCatPlaying(true, 45));
    System.out.println("Test 5: isCatPlaying(false, 25) should be true = " + isCatPlaying(false, 25));
  }

  public static boolean isCatPlaying(boolean isSummer, int temperature) {
    int temperatureUpperLimit = 35;
    int temperatureLowerLimit = 25;

    if (isSummer) {
      temperatureUpperLimit = 45;
    }

    return temperature >= temperatureLowerLimit && temperature <= temperatureUpperLimit;
  }
}
