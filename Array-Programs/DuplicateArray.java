
public class DuplicateArray {
    public static void main(String[] args) {
        int arr[] = {1,2,2,3,3,4,1,4,5,7,7,8,8};
        System.out.println("Duplicate elements in the given array");

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if (arr[i] == arr[j])
                System.out.println(arr[j]);
            }
        }
    }
}
