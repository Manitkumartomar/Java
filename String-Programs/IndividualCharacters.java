public class IndividualCharacters {
    public static void main(String[] args) {
        // Input string
        String string = "characters";

        // Print statement indicating the operation being performed
        System.out.print("Individual characters from string: ");

        // Loop through each character in the string
        for(int i=0; i<string.length(); i++) {
            // Print the current character followed by a space
            System.out.print(string.charAt(i) + " ");
        }
    }
}
