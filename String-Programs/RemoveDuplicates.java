// Program for removing duplicates characters from a string or a sentence

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {

        // Scanner Object
        Scanner sc = new Scanner(System.in);
        while (true) {

            // Prompt to the user to write a string here
            System.out.print("Write a string here: ");
            String string1 = sc.nextLine();

            // Printing original string
            System.out.println("Your Original String is: " + string1);
            System.out.println("===============================");

            // Converting String into lowercase
            String string = string1.toLowerCase();

            // Counting with 1
            int count = 1;

            // Creating an array for characters of the String
            char str[] = string.toCharArray();

            // Printing string after removing duplicates
            System.out.print("After Removing Duplicates Characters: ");

            // Outer loop for hovering over the characters of the string
            for (int i = 0; i < str.length; i++) {

                // Inner loop for comparing characters
                for (int j = i + 1; j < str.length; j++) {

                    // Some conditions checking...
                    if (str[i] == str[j] && str[i] != ' ') {
                        count++;
                        str[j] = '0';
                    }
                }

                // Condition for after removing duplicate characters..
                if (count > 0 && str[i] != '0') {
                    System.out.print(str[i]);
                }
            }

            System.out.println();// Printing next line

            // Prompt to the user to continue or not
            System.out.print("Do you want to continue?(Y/N): ");
            String choice = sc.nextLine();
            if (choice.equalsIgnoreCase("N")) {
                System.out.println("Now you are out of the program!!!");
                break;// Breaking the loop and closing the program
            }
        }
        sc.close();// Scanner closed
    }
}
