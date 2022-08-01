package conditional_statement;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a, b;
        System.out.println("Input floating-point number: ");
        a = scanner.nextFloat();
        System.out.println("Input floating-point another number: ");
        b = scanner.nextFloat();

        a = a * 1000;
        System.out.println(a);
        b = b * 1000;
        System.out.println(b);

        if (a == b) {
            System.out.println("They are the same up to three decimal places");
        } else {
            System.out.println("They are different");
        }
    }
}
