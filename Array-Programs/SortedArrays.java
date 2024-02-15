import java.util.Arrays;

public class SortedArrays {
    public static void main(String[] args) {
        int arr[] = { 76, 45, 23, 46, 98, 65, 33, 56, 34 };

        // Invoking sort() method
        Arrays.sort(arr);
        System.out.println("Sorting with sort() method....");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("------------------------------------");
        // Sorted array using user defined method
        sortArray(arr, arr.length);
        System.out.println("Sorting with user defined method....");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    private static void sortArray(int arr[],int n){
        for(int i=0;i<n;i++){
            int j=i;
            int a = arr[i];
            while ((j<0) && (arr[j-1]>a)) {
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = a;
        }
    }
}
