public class AscendingNDescending {
    public static void main(String[] args) {
        int arr[] = {98,23,99,33,45,21,46,11,78,96,44};
        int asc = 0;
        System.out.println("Original Elements of the given array...");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if (arr[i]>arr[j]) {
                    asc = arr[i];
                    arr[i] = arr[j];
                    arr[j] = asc;
                 }
            }
        }
        System.out.println();
        System.out.println("---------------------");
        System.out.println("Ascending order of the elements...");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("---------------------");
        System.out.println("Descending order of the elements...");
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }


    }
}
