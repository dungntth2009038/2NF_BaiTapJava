package numbers_i;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Number Counting [(integers) between 1 to 10,000]:");
        int abundant = 0;
        int deficiency = 0;
        int perfect = 0;
        for (int i = 1; i <= 10000; i++){
            int check = sumOfProperDivisor(i);
            if (check > i) abundant++;
            else if (check < i) deficiency++;
            else perfect++;
        }
        System.out.println("Deficient number: " + deficiency);
        System.out.println("Perfect number: " + perfect);
        System.out.println("Abundant number: " + abundant);
    }
    public static int sumOfProperDivisor(int n){
        int count = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) count += i;
        }
        return count;
    }
}
