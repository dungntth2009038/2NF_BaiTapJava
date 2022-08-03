package sorting_i;

import java.util.Arrays;

public class Q9 {
    void gnomeSort(int[] nums)
    {
        int i=1;
        int j=2;

        while(i < nums.length) {
            if ( nums[i-1] <= nums[i] )
            {
                i = j; j++;
            } else {
                int tmp = nums[i-1];
                nums[i-1] = nums[i];
                nums[i--] = tmp;
                i = (i==0) ? j++ : i;
            }
        }
    }

    public static void main(String args[])
    {
        Q9 ob = new Q9();
        int nums[] = {7, -5, 3, 2, 1, 0, 45};
        System.out.println("Original Array:");
        System.out.println(Arrays.toString(nums));
        ob.gnomeSort(nums);
        System.out.println("Sorted Array");
        System.out.println(Arrays.toString(nums));
    }
}
