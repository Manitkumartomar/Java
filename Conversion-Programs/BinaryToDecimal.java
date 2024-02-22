/**
 * This class demonstrates different methods to convert binary numbers to
 * decimal.
 */
public class BinaryToDecimal {

    /**
     * The main method where the program starts execution.
     * 
     * @param args The command-line arguments passed to the program.
     */
    public static void main(String[] args) {
        // Binary numbers to convert
        String binaryNumber = "1010";

        // Java Binary to Decimal conversion: Integer.parseInt()
        int decimal = Integer.parseInt(binaryNumber, 2);
        System.out.println("Decimal value is: " + decimal);

        // Additional examples of Binary to Decimal conversion using Integer.parseInt()
        System.out.println("Decimal value is: " + Integer.parseInt("11001", 2));
        System.out.println("Decimal value is: " + Integer.parseInt("101010", 2));
        System.out.println("Decimal value is: " + Integer.parseInt("1001", 2));

        // Java Binary to Decimal conversion: Custom Logic
        System.out.println("=================================");
        System.out.println("Using custom logic...");
        System.out.println("Decimal value: " + getDecimal(101001));
        System.out.println("Decimal value: " + getDecimal(11100011));
    }

    /**
     * A method to convert a binary number to decimal using custom logic.
     * 
     * @param binary The binary number to convert to decimal.
     * @return The decimal representation of the binary number.
     */
    public static int getDecimal(int binary) {
        int decimal1 = 0; // Initialize decimal value
        int n = 0; // Initialize power of 2

        // Loop to convert binary to decimal
        while (true) {
            if (binary == 0) {
                break; // Exit loop if binary number is fully converted
            } else {
                int temp = binary % 10; // Extract last digit of binary number
                decimal1 += temp * Math.pow(2, n); // Calculate decimal equivalent
                binary = binary / 10; // Remove last digit from binary number
                n++; // Increment power of 2
            }
        }
        return decimal1; // Return the decimal equivalent
    }
}
