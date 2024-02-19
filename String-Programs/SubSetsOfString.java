// Class to generate all possible subsets of a given string
public class SubSetsOfString {
    // Main method to execute the program
    public static void main(String[] args) {
        // Input string
        String str = "SUN";
        // Calculate the length of the input string
        int len = str.length();
        // Initialize a variable to keep track of the position in the string array
        int temp = 0;

        // Calculate the maximum possible number of subsets
        String string[] = new String[len * (len + 1) / 2];

        // Nested loops to generate all subsets
        for(int i = 0; i < len; i++) {
            for(int j = i; j < len; j++) {
                // Extract substring from index i to index j (inclusive) and store it in the array
                string[temp] = str.substring(i, j + 1);
                // Move to the next position in the array
                temp++;
            }
        }

        // Print all subsets generated
        System.out.println("All subsets for the given string are: ");
        for(int i = 0; i < string.length; i++) {
            System.out.print(string[i] + " ");
        }
    }
}
