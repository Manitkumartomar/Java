public class EvenNOddNumbers {
    public static void main(String[] args) {
        int arr[] = {12,32,21,55,77,87,65,98};
        System.out.println("Original elements...");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Even elements of the given array...");
        for(int i=0;i<arr.length;i++){
            if (arr[i]%2==0) {
                System.out.print(arr[i]+" ");
            }
        }

        System.out.println();
        System.out.println("Odd elements of the given array...");
        for(int i=0;i<arr.length;i++){
            if (arr[i]%2!=0) {
                System.out.print(arr[i]+" ");
            }
        }
    }
}
