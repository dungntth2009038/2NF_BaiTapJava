package conditional_statement;

import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int sum = 0;
        System.out.println("Input number of terms is: ");
        a = scanner.nextInt();

        for (int i = 1; i <= a; i++) {
            System.out.println(2 * i - 1);
            sum = sum + 2 * i -1;
        }
        System.out.println("The Sum of odd Natural Number upto" + a + "terms is: " +sum);
    }
}

