
public class RightTriangle {
    public static void main(String[] args) {
        int rows = 6;
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        // Reverse Right Triangle...
        System.out.println("\nReverse Right Triangle...");
        for(int i=rows;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }    
}
