package numbers_i;

import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number: ");
        int n = scanner.nextInt();
        int n1 = n + 1;
        int power = 0;
        int ans = 0;
        for (int i = 0;;i++){
            power = (int) Math.pow(2,i);
            if (power > n1){
                break;
            }
            else if (power == n1){
                System.out.println(n+" is a Mersenne number. ");
                ans = 1;
            }
        }
        if (ans == 0){
            System.out.println(n+" is not a Mersenne number.");
        }
    }
}
