public class LargestNSmallestElement {
    public static void main(String[] args) {
        int arr[] = {11,23,43,12,12,67,54,32,12,10};
        int max = arr[0];
        int min = arr[0];
        for(int i=0;i<arr.length;i++){
            if (arr[i]>max) {
                max = arr[i];
            }
            if (arr[i]<min) {
                min = arr[i];
            }
        }
        System.out.println("Largest Element : "+max);
        System.out.println("-------------------------");
        System.out.println("Smallest Element : "+min);
    }
}
