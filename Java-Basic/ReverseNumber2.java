import java.util.Scanner;

public class ReverseNumber2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number that you want to reverse...");
        int n = sc.nextInt();
        int res = reverseNumber(n);
        System.out.println("Reverse number is : " + res);
        sc.close();

    }
    // Method to reverse a number...

    public static int reverseNumber(int number) {
        boolean isNoNegative = number < 0 ? true : false;
        if (isNoNegative) {
            number = number * -1;// makes a number positive if it is negative...
        }
        int reverse = 0;
        int remainder = 0;

        while (number >= 1) {
            remainder = number % 10;// gives the remainder
            reverse = reverse * 10 + remainder;
            number = number / 10;// remove the last digit of the number...
        }
        return isNoNegative == true ? reverse * -1 : reverse;
    }
}
