package method_i;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;

        System.out.println("Input the first number: ");
        a = scanner.nextInt();
        System.out.println("Input the Second number: ");
        b = scanner.nextInt();
        System.out.println("Input the third number: ");
        c = scanner.nextInt();
        int number_min = Math.min(Math.min(a,b),c);
        System.out.println("The smallest value is "+number_min);
//        if (a < b || a < c) {
//            System.out.println("The smallest value is " + a);
//        } else if (b < a || b < c) {
//            System.out.println("The smallest value is " + b);
//        } else if (c < a || c < b) {
//            System.out.println("The smallest value is " + c);
//        }
    }
}
