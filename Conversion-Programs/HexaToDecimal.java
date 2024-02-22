/**
 * This class demonstrates different methods to convert hexadecimal numbers to
 * decimal.
 */
public class HexaToDecimal {

    /**
     * The main method where the program starts execution.
     * 
     * @param args The command-line arguments passed to the program.
     */
    public static void main(String[] args) {
        // Java Hexadecimal to Decimal conversion using Integer.parseInt()
        String hex = "a";
        int num = Integer.parseInt(hex, 16);
        System.out.println("Decimal number: " + num);

        // Additional examples of Hexadecimal to Decimal conversion using custom logic
        System.out.println("===========================");
        System.out.println("Java Hexadecimal to Decimal conversion: Custom Logic...");

        // Convert various hexadecimal values to decimal using custom logic
        System.out.println("Decimal of a is: " + getDecimal("a"));
        System.out.println("Decimal of b is: " + getDecimal("b"));
        System.out.println("Decimal of f is: " + getDecimal("f"));
        System.out.println("Decimal of g is: " + getDecimal("g"));
        System.out.println("Decimal of h is: " + getDecimal("h"));
        System.out.println("Decimal of 121 is: " + getDecimal("121"));
    }

    /**
     * A method to convert a hexadecimal number to decimal using custom logic.
     * 
     * @param hex The hexadecimal number to convert to decimal.
     * @return The decimal representation of the hexadecimal number.
     */
    public static int getDecimal(String hex) {
        String digits = "0123456789ABCDEF"; // Define hexadecimal digits

        hex = hex.toUpperCase(); // Convert hex string to uppercase
        int val = 0; // Initialize decimal value
        for (int i = 0; i < hex.length(); i++) {
            char c = hex.charAt(i); // Get character at current index
            int d = digits.indexOf(c); // Get index of character in hexadecimal digits
            val = val * 16 + d; // Update decimal value
        }
        return val; // Return the decimal equivalent
    }
}
