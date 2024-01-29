import java.util.Scanner;

public class PrimeList {
    public static boolean isPrime(int n){
        if (n<=1) {
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if (n%i==0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int start = sc.nextInt();
        System.out.println("Enter last number");
        int end = sc.nextInt();
        System.out.println("List of prime numbers between "+start+" and "+end);
        sc.close();

        for(int i=start;i<=end;i++){
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
}
