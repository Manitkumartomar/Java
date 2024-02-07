
public class Pattern_5 {
    public static void main(String[] args) {
        int n = 8;
        for(int i=n;i>=1;i--){
            for(int j=n;j>=i;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println("\n");
        for(int i=1;i<=n;i++){
            for(int j=i;j>=1;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
