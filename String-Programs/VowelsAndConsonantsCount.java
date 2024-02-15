import java.util.Scanner;

// Class to count the number of vowels and consonants in a sentence
public class VowelsAndConsonantsCount {
    // Main method to execute the program
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a sentence
        System.out.println("Write a sentence to count vowels and consonants...");
        
        // Read the input sentence
        String sentence = scanner.nextLine();
        
        // Convert the sentence to lowercase to simplify character comparison
        sentence.toLowerCase();
        
        // Variables to store the counts of vowels and consonants
        int vCount = 0; // Count of vowels
        int cCount = 0; // Count of consonants
        
        // Iterate through each character in the sentence
        for (int i = 0; i < sentence.length(); i++) {
            // Check if the character is a vowel
            if (sentence.charAt(i) == 'a' || sentence.charAt(i) == 'e' || sentence.charAt(i) == 'i'
                    || sentence.charAt(i) == 'o' || sentence.charAt(i) == 'u') {
                // If the character is a vowel, increment the vowel count
                vCount++;
            } else {
                // If the character is not a vowel (i.e., it's a consonant), increment the consonant count
                cCount++;
            }
        }
        
        // Display the number of vowels and consonants in the sentence
        System.out.println("Number of vowels in your sentence is: " + vCount);
        System.out.println("Number of consonants in your sentence is: " + cCount);
        
        // Close the Scanner object to prevent resource leak
        scanner.close();
    }
}
