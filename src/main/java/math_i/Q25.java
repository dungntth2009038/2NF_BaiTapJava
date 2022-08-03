package math_i;

import java.util.Scanner;

public class Q25 {
    static float Exponential(int n, float x) {
        float num = 1;
        for (int i = n - 1; i > 0; --i) {
            num = 1 + x * num / 1;
        }
        return num;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input n : ");
        int n = scanner.nextInt();
        System.out.println("Input x : ");
        float x = scanner.nextFloat();
        if (n > 0 && x > 0){
            System.out.println("e^x ="+Exponential(n,x));
        }
    }
}
