
public class LeftPascalTriangle {
    public static void main(String[] args) {
        int rows = 7;
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=2*(rows-i);j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=rows-1;i>=1;i--){
            for(int j=1;j<=2*(rows-i);j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
