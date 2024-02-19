import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {
        int myNumber = (int) (Math.random()*100);
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess the number(1-100)...!!!");
        int userNumber = 0;
        do{
            userNumber = sc.nextInt();
           if (userNumber==myNumber) {
            System.out.println("WOOHOO!!!...CORRECT NUMBER...!!!");
            break;
           }else if (userNumber<myNumber) {
            System.out.println("Your number is too small.!!!");
           }else{
            System.out.println("Your number is too large.!!!");
           }
        }while(userNumber>=0);

        System.out.print("My number was: ");
        System.out.println(myNumber);
        sc.close();
    }
}