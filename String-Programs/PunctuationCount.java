import java.util.Scanner;

// Class to count the number of punctuation marks in a sentence
public class PunctuationCount {
    // Main method to execute the program
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter a sentence
        System.out.println("Write a sentence here with punctuation marks...");
        
        // Read the input sentence
        String sentence = sc.nextLine();

        // Variable to store the count of punctuation marks
        int count = 0;
        
        // Iterate through each character in the sentence
        for (int i = 0; i < sentence.length(); i++) {
            // Check if the character is a punctuation mark
            if (sentence.charAt(i) == '!' || sentence.charAt(i) == '.' || sentence.charAt(i) == ';'
                    || sentence.charAt(i) == ',' || sentence.charAt(i) == '\"' || sentence.charAt(i) == '?'
                    || sentence.charAt(i) == '/' || sentence.charAt(i) == ':') {
                // If the character is a punctuation mark, increment the count
                count++;
            }
        }
        
        // Display the number of punctuation marks in the sentence
        System.out.println("Number of punctuations in your sentence is : " + count);
        
        // Close the Scanner object to prevent resource leak
        sc.close();
    }
}
