public class DuplicateCharacters {

    public static void main(String[] args) {
        // Input string
        String string = "Great responsiblity";
        // Variable to store count of characters
        int count;
        // Convert string to character array
        char str[] = string.toCharArray();
        // Print message indicating duplicate characters will be displayed
        System.out.println("Duplicate characters in a given string: ");

        // Loop through each character in the array
        for (int i = 0; i < str.length; i++) {
            // Initialize count to 1 for each character
            count = 1;
            // Compare current character with all other characters
            for (int j = i + 1; j < str.length; j++) {
                // If current character is same as another character and not a space
                if (str[i] == str[j] && str[i] != ' ') {
                    // Increment count and mark duplicate character as '0'
                    count++;
                    str[j] = '0';
                }
            }
            // If count is greater than 1 (indicating duplicate) and character is not marked
            // as '0'
            if (count > 1 && str[i] != '0') {
                // Print the duplicate character
                System.out.print(str[i] + " ");
            }
        }
    }
}
