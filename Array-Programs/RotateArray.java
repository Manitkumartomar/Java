
public class RotateArray {
    public static void main(String[] args) {
        int nums [] = {1,2,3,4,5,6,7,8,9};
        int n = 5;
        System.out.println("Original Array...");
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        for(int i=0;i<n;i++){
            int j,first;
            first = nums[0];
            for(j=0;j<nums.length-1;j++){
                nums[j]=nums[j+1];
            }
            nums[j]=first;
        }
        System.out.println();
        System.out.println("After rotating array...");
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
