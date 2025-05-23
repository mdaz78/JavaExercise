/**
 *
 * Accurate MegaBytes Converter For Mastering Integer Math In Java
 * Write a method called printMegaBytesAndKiloBytes that has 1 parameter of type
 * int with the name kiloBytes.
 *
 * The method should not return anything (void) and it needs to calculate the
 * megabytes and remaining kilobytes from the kilobytes parameter.
 *
 * Then it needs to print a message in the format "XX KB = YY MB and ZZ KB".
 *
 * XX represents the original value kiloBytes.
 * YY represents the calculated megabytes.
 * ZZ represents the calculated remaining kilobytes.
 *
 * For example, when the parameter kiloBytes is 2500 it needs to print "2500 KB
 * = 2 MB and 452 KB"
 *
 * If the parameter kiloBytes is less than 0 then print the text "Invalid
 * Value".
 *
 * EXAMPLE INPUT/OUTPUT
 *
 * printMegaBytesAndKiloBytes(2500); → should print the following text: "2500 KB
 * = 2 MB and 452 KB"
 *
 * printMegaBytesAndKiloBytes(-1024); → should print the following text:
 * "Invalid Value" because parameter is less than 0.
 *
 * printMegaBytesAndKiloBytes(5000); → should print the following text: "5000 KB
 * = 4 MB and 904 KB"
 *
 * TIP: Be extremely careful about spaces in the printed message.
 * TIP: Use the remainder operator
 * TIP: 1 MB = 1024 KB
 *
 * NOTE: Do not set kilobytes parameter value inside your method.
 *
 */

public class MegaBytesConverter {
    public static void main(String[] args) {
        // Test with various kilobyte values
        System.out.println("Test 1: printMegaBytesAndKiloBytes(2500):");
        printMegaBytesAndKiloBytes(2500);

        System.out.println("\nTest 2: printMegaBytesAndKiloBytes(-1024):");
        printMegaBytesAndKiloBytes(-1024);

        System.out.println("\nTest 3: printMegaBytesAndKiloBytes(5000):");
        printMegaBytesAndKiloBytes(5000);

        System.out.println("\nTest 4: printMegaBytesAndKiloBytes(1024):");
        printMegaBytesAndKiloBytes(1024);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int KB_IN_MB = 1024;

        int totalMb = kiloBytes / KB_IN_MB;
        int remainingKb = kiloBytes % KB_IN_MB;

        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kiloBytes + " KB = " + totalMb + " MB and " + remainingKb + " KB");
        }
    }
}
