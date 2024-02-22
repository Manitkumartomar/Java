/**
 * This class demonstrates different methods to convert octal numbers to
 * decimal.
 */
public class OctalToDecimal {
    /**
     * The main method where the program starts execution.
     * 
     * @param args The command-line arguments passed to the program.
     */
    public static void main(String args[]) {
        // Declaring an octal number
        String octalString = "120";
        // Converting octal number into decimal using Integer.parseInt()
        int decimal = Integer.parseInt(octalString, 8);
        // Printing converted decimal number
        System.out.println(decimal);
        // Separator line
        System.out.println("=========================");
        // Printing custom logic conversion results
        System.out.println("Java Octal to Decimal conversion: Custom Logic");
        System.out.println("Decimal of 121 octal is: " + getDecimal(121));
        System.out.println("Decimal of 23 octal is: " + getDecimal(23));
        System.out.println("Decimal of 10 octal is: " + getDecimal(10));
    }

    /**
     * A method to convert an octal number to decimal using custom logic.
     * 
     * @param octal The octal number to convert to decimal.
     * @return The decimal representation of the octal number.
     */
    // Declaring method
    public static int getDecimal(int octal) {
        // Declaring variable to store decimal number
        int decimal = 0;
        // Declaring variable to use in power
        int n = 0;
        // writing logic
        while (true) {
            if (octal == 0) {
                break;
            } else {
                int temp = octal % 10;
                decimal += temp * Math.pow(8, n);
                octal = octal / 10;
                n++;
            }
        }
        return decimal;
    }
}
