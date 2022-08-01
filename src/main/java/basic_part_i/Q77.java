package basic_part_i;


import java.util.Arrays;

public class Q77 {
    public static void main(String[] args) {
        int[] array1 = {50,-20,0};
        int[] array2 = {5,-50,10};
//
        System.out.println("Array1: "+ Arrays.toString(array1));
        System.out.println("Array2: "+ Arrays.toString(array2));
        int[] new_array = {array1[0],array2[2]};
        System.out.println("New Array: " +Arrays.toString(new_array));
    }
}
