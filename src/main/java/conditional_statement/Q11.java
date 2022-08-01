package conditional_statement;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        int n , sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number: ");
        n = scanner.nextInt();

        System.out.println("The first n natural numbers are : "+n);
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
            sum+=i;
        }
        System.out.println("The Sum of Natural Number upto n terms : \n"+n+sum);
    }
}
