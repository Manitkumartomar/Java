public class EvenNOddPosition {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        System.out.println("Elements of Even Position...");
        for(int i=1;i<arr.length;i=i+2){
             System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Elements of Odd Position...");
        for(int i=0;i<arr.length;i=i+2){
            System.out.print(arr[i]+" ");
        }
     }
}
