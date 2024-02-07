import java.util.Scanner;

public class TriangleStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows you want to print: ");
        int rows = sc.nextInt();
        for(int i=1;i<=rows;i++){
            for(int j=i;j<rows;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i-1);k++){
                if (k == 1 || i == rows || k == (2*i-1)) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
           System.out.println();
        }
        // Reverse Triangle Star
        System.out.println("\nReverse Triangle Star...");
        for(int i=rows;i>=1;i--){
            for(int j=i;j<rows;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i-1);k++){
                if (k == 1 || i == rows || k == (2*i-1)) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
           System.out.println();
        }
        sc.close();
    }
}
