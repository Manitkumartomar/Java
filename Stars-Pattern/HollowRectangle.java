import java.util.Scanner;

public class HollowRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("To print hollow rectangle...");
        System.out.println("Enter the number of rows you want");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns you want");
        int colomns = sc.nextInt();
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=colomns;j++){
                if (i == 1 || i == rows || j == 1 || j == colomns) {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }   
            }
           System.out.println();
        }
        sc.close();
    }
}
