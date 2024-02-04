import java.util.Scanner;

public class ReverseNumber1 {

    // Reversing a number using recursion....

    public static void reverseNumber(int number){
        if (number<10) {
            System.out.println(number);
            return;
        }else{
          System.out.print(number%10);
          reverseNumber(number/10);
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number that you want to reverse...");
        int num = sc.nextInt();
        System.out.println("Reverse number is : ");
        reverseNumber(num);
        sc.close();
        
    }
}
