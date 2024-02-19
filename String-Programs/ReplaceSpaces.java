public class ReplaceSpaces {
    public static void main(String[] args) {
        // Define the input string
        String string = "Once in a blue moon";

        // Define the character to replace spaces with
        char ch = '-';

        // Replace spaces in the string with the specified character
        string = string.replace(' ', ch);

        // Print the modified string
        System.out.println(string);
    }
}
