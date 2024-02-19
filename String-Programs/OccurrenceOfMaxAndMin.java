public class OccurrenceOfMaxAndMin {
    public static void main(String[] args) {
        // Input string
        String str = "grass is greener on the other side";

        // Array to store the frequency of each character in the string
        int freq[] = new int[str.length()];

        // Variables to store the minimum and maximum occurring characters
        char minChar = str.charAt(0), maxChar = str.charAt(0);

        // Variables to store the minimum and maximum frequencies
        int i, j, min, max;

        // Convert the string to a character array
        char string[] = str.toCharArray();

        // Calculate the frequency of each character in the string
        for (i = 0; i < string.length; i++) {
            freq[i] = 1;
            for (j = i + 1; j < string.length; j++) {
                if (string[i] == string[j] && string[i] != ' ' && string[i] != '0') {
                    freq[i]++;
                    string[j] = '0'; // Mark the character as processed to avoid counting it again
                }
            }
        }

        // Initialize min and max frequencies with the frequency of the first character
        min = max = freq[0];

        // Find the minimum and maximum frequencies and their respective characters
        for (i = 0; i < freq.length; i++) {
            if (min > freq[i] && freq[i] != '0') {
                min = freq[i];
                minChar = string[i];
            }
            if (max < freq[i]) {
                max = freq[i];
                maxChar = string[i];
            }
        }

        // Print the minimum and maximum occurring characters
        System.out.println("Minimum occurring character: " + minChar);
        System.out.println("Maximum occurring character: " + maxChar);
    }
}
