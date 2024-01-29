public class Factorial {
 //Using recursion
    public static int factorial(int n){
        if (n==0 || n==1) {
            return 1;
        }else{
            return n*factorial(n-1);
        }
    }
    public static void main(String[] args) {
        int n = 6;
        int res = factorial(n);
        System.out.println("Factorial value is: "+res);
    }
}
