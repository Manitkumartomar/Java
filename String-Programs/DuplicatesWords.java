public class DuplicatesWords {
    public static void main(String[] args) {
        // Input string
        String string = "Big black bug bit a big black dog on his big black nose.";
        // Variable to store count of words
        int count;
        // Convert string to lowercase to ensure case-insensitive comparison
        string = string.toLowerCase();
        // Split the string into words based on spaces
        String words[] = string.split(" ");
        // Print message indicating duplicate words will be displayed
        System.out.print("Duplicates words are: ");
        // Loop through each word in the array
        for (int i = 0; i < words.length; i++) {
            // Initialize count to 1 for each word
            count = 1;
            // Compare current word with all other words
            for (int j = i + 1; j < words.length; j++) {
                // If current word is same as another word
                if (words[i].equals(words[j])) {
                    // Increment count and mark duplicate word as '0'
                    count++;
                    words[j] = "0";
                }
            }
            // If word is not marked as '0' and count is greater than 1 (indicating duplicate)
            if (!words[i].equals("0") && count > 1) {
                // Print the duplicate word
                System.out.print(words[i] + ", ");
            }
        }
    }
}
