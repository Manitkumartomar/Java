public class GCDExample {
    public static void main(String[] args) {

        //Using for loop...
        // int x = 12,y=8,gcd=1;

        // for(int i=1;i<=x&&i<=y;i++){
        //     if (x%i==0&&y%i==0) {
        //         gcd = i;
        //     }
        // }
        // System.out.printf("GCD of %d and %d is: %d", x, y, gcd);

        //Using While loop...

        int a = 225, b= 75;

        while (a!=b) {
            if (a>b) {
                a=a-b;
            }else{
                b=b-a;
            }
        }
         System.out.println("GCD of a and b is : "+a);
    }
}
