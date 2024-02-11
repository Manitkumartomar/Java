//Remove Duplicate Element in Array using Temporary Array

public class RemoveDuplicateElements {
    public static int remove(int arr[], int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        // New temporary array...
        int temp[] = new int[n];
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        // Changing elements of the array...
        temp[j++] = arr[n - 1];
        for (int i = 0; i < j; i++) {
            arr[i] = temp[i];
        }
        return j;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 20, 30, 30, 40, 50, 50 };
        int length = arr.length;
        length = remove(arr, length);
        // Printing the new aaray...
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}