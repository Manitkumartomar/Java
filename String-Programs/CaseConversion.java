// Class to perform case conversion of characters in a string
public class CaseConversion {
    // Main method to execute the program
    public static void main(String[] args) {
        // Input string
        String str = "caseCONVERSION";
        // Create a StringBuffer to manipulate the characters
        StringBuffer sb = new StringBuffer(str);

        // Print the original string
        System.out.println("String before conversion: " + str);
        System.out.println("-----------------------------");

        // Iterate through each character of the string
        for(int i = 0; i < str.length(); i++) {
            // Check if the character is lowercase
            if (Character.isLowerCase(str.charAt(i))) {
                // If lowercase, convert it to uppercase and update in the StringBuffer
                sb.setCharAt(i, Character.toUpperCase(str.charAt(i)));
            }
            // Check if the character is uppercase
            else if (Character.isUpperCase(str.charAt(i))) {
                // If uppercase, convert it to lowercase and update in the StringBuffer
                sb.setCharAt(i, Character.toLowerCase(str.charAt(i)));
            }
        }

        // Print the string after case conversion
        System.out.println("String after conversion: " + sb);
    }
}
