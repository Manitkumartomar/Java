/**
 * This class demonstrates different methods to convert decimal numbers to
 * hexadecimal.
 */
public class DecimalToHex {

    /**
     * The main method where the program starts execution.
     * 
     * @param args The command-line arguments passed to the program.
     */
    public static void main(String[] args) {
        // Java Decimal to Hex conversion using Integer.toHexString()
        System.out.println("HexaDecimal value: " + Integer.toHexString(10));
        System.out.println("HexaDecimal value: " + Integer.toHexString(16));
        System.out.println("HexaDecimal value: " + Integer.toHexString(1));

        // Additional examples of Decimal to Hex conversion using custom logic
        System.out.println("---------------------------");
        System.out.println("Java Decimal to Hex conversion: Custom Logic");
        System.out.println("Hexadecimal of 10 is: " + toHex(10));
        System.out.println("Hexadecimal of 15 is: " + toHex(15));
        System.out.println("Hexadecimal of 289 is: " + toHex(289));
    }

    /**
     * A method to convert a decimal number to hexadecimal using custom logic.
     * 
     * @param decimal The decimal number to convert to hexadecimal.
     * @return The hexadecimal representation of the decimal number.
     */
    public static String toHex(int decimal) {
        int rem; // Remainder variable
        String hex = ""; // Initialize hexadecimal string
        // Define hexadecimal characters
        char hexChar[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
        while (decimal > 0) {
            rem = decimal % 16; // Calculate remainder when divided by 16
            hex = hexChar[rem] + hex; // Append hexadecimal character corresponding to the remainder
            decimal = decimal / 16; // Update decimal number
        }
        return hex; // Return the hexadecimal representation
    }
}
