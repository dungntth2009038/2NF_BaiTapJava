package basic_part_i;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number: ");
        a = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(+a + " x "+ i + " = " + (a*i));
        }
    }
}
