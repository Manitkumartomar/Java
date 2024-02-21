public class FrequencyOfCharacters {
    public static void main(String[] args) {
        // Input string
        String string = "Grass is going greener, more greener";
        // Array to store frequencies of characters
        int freq[] = new int[string.length()];
        // Variables for looping
        int i, j;
        // Convert string to character array
        char arr[] = string.toCharArray();
        
        // Loop through each character in the array
        for (i = 0; i < string.length(); i++) {
            // Initialize frequency to 1 for each character
            freq[i] = 1;
            // Compare current character with all other characters
            for (j = i + 1; j < string.length(); j++) {
                // If current character is same as another character
                if (arr[i] == arr[j]) {
                    // Increment frequency and mark duplicate character as '0'
                    freq[i]++;
                    arr[j] = '0';
                }
            }
        }
        
        // Print message indicating characters and their frequencies will be displayed
        System.out.println("Characters and their corresponding frequencies...");
        // Loop through each character and its frequency
        for (i = 0; i < freq.length; i++) {
            // If character is not a space and not marked as '0'
            if (arr[i] != ' ' && arr[i] != '0') {
                // Print character and its frequency
                System.out.println(arr[i] + " - " + freq[i]);
            }
        }
    }
}
