package conditional_statement;

import java.util.Scanner;

public class Q29 {
    public static void main(String[] args) {
        long a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input an integer number less than ten billion: ");
        a = scanner.nextLong();
        String str = String.valueOf(a);
        if(str.length()<=10)
            System.out.println("Number of digits in the number: "+str.length());
        else System.out.println("The number is bigger than ten billions");
    }
}
