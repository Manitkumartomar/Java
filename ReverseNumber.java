import java.util.Scanner;

// Reverse Number Example...

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to reverse it...");
        int num = sc.nextInt();
        sc.close();
        int reverse = 0;
        
        // Using While loop...

        // while (num!=0) {
        //     int remainder = num%10;
        //     reverse = reverse*10 + remainder;
        //     num = num/10;
        // }

        // Using for loop...

        for(; num!=0;num=num/10){
            int remainder = num%10;
            reverse = reverse*10+remainder;
        }

        System.out.println("The reverse number is : "+reverse);
    }
}
