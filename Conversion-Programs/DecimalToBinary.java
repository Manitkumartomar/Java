/**
 * This class demonstrates different methods to convert decimal numbers to
 * binary.
 */
public class DecimalToBinary {

    /**
     * The main method where the program starts execution.
     * 
     * @param args The command-line arguments passed to the program.
     */
    public static void main(String[] args) {
        // Decimal number to convert to binary
        int num = 21;

        // Using built-in method to convert decimal to binary
        String binaryNum = Integer.toBinaryString(num);
        System.out.println("Binary number is: " + binaryNum);

        // Additional examples of converting decimal to binary using custom logic
        System.out.println("======================");
        System.out.print("Binary value: ");
        toBinary(45);
        System.out.print("Binary value: ");
        toBinary(23);
    }

    /**
     * A method to convert a decimal number to binary using custom logic.
     * 
     * @param decimal The decimal number to convert to binary.
     */
    public static void toBinary(int decimal) {
        int binary[] = new int[40]; // Array to store binary digits
        int index = 0; // Index to track array position

        // Loop to convert decimal to binary
        while (decimal > 0) {
            binary[index++] = decimal % 2; // Calculate binary digit and store it
            decimal = decimal / 2; // Update decimal number
        }

        // Print binary representation
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(binary[i]); // Print binary digits in reverse order
        }
        System.out.println(); // Print newline after binary representation
    }
}
