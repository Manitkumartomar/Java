import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer to check whether it is negative or positive");
        try {
            // Attempt to read the input as an integer
            int num = sc.nextInt();
            if (num<0) {
                System.out.println(num+" is negative");
            }else if (num==0) {
                System.out.println(num+" neither negative nor positive");
            }else{
                System.out.println(num+" is positive");
            }
           
        } catch (java.util.InputMismatchException e) {
            // Handle the exception if the input is not an integer
            System.out.println("Invalid input. Please enter a valid integer.");
        } finally {
            // Close the scanner to prevent resource leak
            sc.close();
        }
        
       
    }
}
