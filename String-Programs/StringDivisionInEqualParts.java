import java.util.Scanner;

// Class to divide a string into equal parts based on user input
public class StringDivisionInEqualParts {
    // Main method to execute the program
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Loop indefinitely until the user chooses to exit
        while (true) {
            // Prompt the user to enter a string to divide into equal parts
            System.out.println("Write a String here to divide it into equal parts (or 'Exit' to quit the program): ");
            String str = scanner.next();
            
            // Check if the user wants to exit the program
            if (str.equalsIgnoreCase("Exit")) {
                System.out.println("Exiting the program...!");
                break; // Exit the loop
            }
            
            // Get the length of the input string
            int l = str.length();
            
            // Prompt the user to enter the number of parts to divide the string into
            System.out.print("Enter the number in which parts you want to divide it: ");
            int n = scanner.nextInt();
            
            // Variables to track the division process
            int temp = 0; // Temporary variable
            int chars = l / n; // Number of characters in each part
            
            // Array to store the equal parts of the string
            String[] equalStr = new String[n];
            
            // Check if the string can be divided into equal parts
            if (l % n != 0) {
                System.out.println("String can't be divided into " + n + " equal parts!");
            } else {
                // Divide the string into equal parts
                for (int i = 0; i < l; i = i + chars) {
                    String part = str.substring(i, i + chars);
                    equalStr[temp] = part;
                    temp++;
                }
                
                // Display the equal parts of the string
                System.out.println(n + " equal parts of the string are: ");
                for (int i = 0; i < equalStr.length; i++) {
                    System.out.println(equalStr[i]);
                }
            }
        }
        
        // Close the Scanner object to prevent resource leak
        scanner.close();
    }
}
