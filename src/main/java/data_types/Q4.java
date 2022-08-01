package data_types;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minutesInYear = 60 * 24 * 365;
        System.out.println("Input the number of minutes");
        int a = scanner.nextInt();
        int years =  (a / minutesInYear);
        int days =  (a / 60 / 24) % 365;
        System.out.println(a + " minutes is approximately " + years + " years and " + days + " days");
    }
}
