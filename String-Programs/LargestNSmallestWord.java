public class LargestNSmallestWord {
    public static void main(String[] args) {
        // Input string
        String string = "Hardship often prepare ordinary people for an extraordinary destiny";
        String word = "", small = "", largest = ""; // Initialize variables to store words, smallest word, and largest
                                                    // word
        String words[] = new String[100]; // Array to store individual words
        int length = 0; // Initialize length counter
        string = string + " "; // Append a space at the end to ensure the last word is processed

        // Loop through the input string character by character
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != ' ') { // If the current character is not a space
                word = word + string.charAt(i); // Append the character to the current word
            } else { // If the current character is a space, indicating the end of a word
                words[length] = word; // Store the word in the words array
                length++; // Increment the length counter
                word = ""; // Reset the word variable for the next word
            }
        }

        // Initialize smallest and largest words with the first word
        small = largest = words[0];

        // Iterate through the words array to find the smallest and largest words
        for (int j = 0; j < length; j++) {
            if (small.length() > words[j].length()) { // If the current word is smaller than the smallest word
                small = words[j]; // Update the smallest word
            }
            if (largest.length() < words[j].length()) { // If the current word is larger than the largest word
                largest = words[j]; // Update the largest word
            }
        }

        // Print the smallest and largest words
        System.out.println("Smallest word is: " + small);
        System.out.println("Largest word is: " + largest);
    }
}
