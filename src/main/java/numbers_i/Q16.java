package numbers_i;

import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Input the second  number: ");
        int num2 = scanner.nextInt();
        int sum_num1 = 0, sum_num2 = 0;
        for (int i = 1; i <= num1; i++) {
            if (num1 % i == 0)
                sum_num1 += i;
        }
        for (int i = 1; i <= num2; i++) {
            if (num2 % i == 0)
                sum_num2 += i;
        }
        if (sum_num1 == sum_num2)
            System.out.println("These numbers are amicable.");
        else {
            System.out.println("These numbers are not amicable.\"");
        }
    }
}
