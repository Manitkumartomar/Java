import java.util.Scanner;

public class IsPalindrome {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Start an infinite loop to continuously prompt the user for input
        while (true) {
            // Prompt the user to enter a string to check if it is a palindrome
            System.out.print("Write a String here to check whether it is palindrome or not (or 'X' to quit!): ");
            
            // Read the input string from the user
            String string = scanner.nextLine();
            
            // Check if the user wants to exit the program
            if (string.equalsIgnoreCase("X")) {
                System.out.println("Goodbye!!!"); // Inform the user that the program is quitting
                break; // Exit the loop
            }
            
            // Initialize a flag to track whether the string is a palindrome
            boolean flag = true;
            
            // Convert the string to lowercase to ignore case sensitivity
            string = string.toLowerCase();

            // Iterate over half of the string to check for palindrome property
            for (int i = 0; i < string.length() / 2; i++) {
                // Compare characters from the beginning and end of the string
                if (string.charAt(i) != string.charAt(string.length() - i - 1)) {
                    // If characters don't match, set the flag to false and exit the loop
                    flag = false;
                    break;
                }
            }
            
            // Check the flag to determine if the string is a palindrome
            if (flag) {
                System.out.println("Your String ~" + string + "~ is a Palindrome!"); // Inform the user that the string is a palindrome
            } else {
                System.out.println("Your String ~" + string + "~ is not a Palindrome!"); // Inform the user that the string is not a palindrome
            }
        }
        
        // Close the scanner to release system resources
        scanner.close();
    }
}
