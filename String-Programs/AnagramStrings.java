import java.util.Arrays;
import java.util.Scanner;

// Class to check if two strings are anagrams of each other
public class AnagramStrings {
    // Main method to execute the program
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the first string
        System.out.print("String-1: ");
        String str1 = scanner.nextLine();
        
        // Prompt the user to enter the second string
        System.out.print("String-2: ");
        String str2 = scanner.nextLine();
        
        // Convert the strings to lowercase to simplify comparison
        str1.toLowerCase();
        str2.toLowerCase();
        
        // Check if the lengths of the strings are different
        if (str1.length() != str2.length()) {
            System.out.println("Both Strings are not Anagram!");
        } else {
            // Convert the strings to char arrays for comparison
            char[] string1 = str1.toCharArray();
            char[] string2 = str2.toCharArray();
            
            // Sort the char arrays
            Arrays.sort(string1);
            Arrays.sort(string2);
            
            // Check if the sorted char arrays are equal
            if (Arrays.equals(string1, string2)) {
                System.out.println("Both Strings are anagram!");
            } else {
                System.out.println("Both Strings are not Anagram!");
            }
        }
        
        // Close the Scanner object to prevent resource leak
        scanner.close();
    }
}
