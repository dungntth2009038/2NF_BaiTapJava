package array_i;

import java.util.Arrays;

public class Q69 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        sum_size(nums1,4);
    }

    public static void sum_size (int[]nums,int size){
        int sum = 0;
        for (int i=0;i< size;i++){
            sum+=nums[i];

        }
        System.out.println(Arrays.toString(nums));
        System.out.println("sub-array size is : "+size);
        System.out.println("Sub-array from "+0+" to "+(size-1)+" and sum is: "+sum);
    }
}
