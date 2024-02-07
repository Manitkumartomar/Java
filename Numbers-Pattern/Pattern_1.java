
public class Pattern_1 {
    public static void main(String[] args) {
        int n = 7;
        for(int i=1;i<=n;i++){
            int number = 1;
            for(int j=1;j<=i;j++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
    }
}
