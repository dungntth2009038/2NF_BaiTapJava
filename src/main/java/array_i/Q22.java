package array_i;

import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        int[] num_array = {2, 7, 4, -5, 11, 5, 20};
        System.out.println("the pair of elements and their sum ");
        for (int i = 0; i < num_array.length; i++) {
            for (int j = i + 1; j < num_array.length; j++) {
                if (num_array[i] + num_array[j] == 15) {
                    System.out.println(num_array[i] + " + " + num_array[j] + " = " + (num_array[i] + num_array[j]));
                }
            }
        }
    }
}
