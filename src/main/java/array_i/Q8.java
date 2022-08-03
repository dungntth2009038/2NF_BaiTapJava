package array_i;

import java.util.Arrays;
import java.util.Arrays;

public class Q8 {
    public static void main(String[] args) {
        int[] my_array = {15, 14, 26, 12, 38, 56, 27, 18, 25, 28};
        int[] new_array = new int[my_array.length];
        System.out.println("Source Array : " + Arrays.toString(my_array));
        for (int i = 0; i < my_array.length; i++) {
            new_array[i] = my_array[i];
        }
        System.out.println("New Array: " + Arrays.toString(new_array));
    }
}


