package method_i;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Input the investment amount: ");
        double amout = scanner.nextInt();
        System.out.println("Input the rate of interest: ");
        double interest = scanner.nextInt();
        System.out.println("Input number of years:");
        double years = scanner.nextInt();
        double y = 0;
        int count = 0;
        int g = 1;

        for (int i = 0 ; i<=(years*12);i++)
        {
            y=amout +(amout *(((interest /12)/100)));
            amout =y;
            count++;
            while(count==(12*g)&&g<=years)
            {
                System.out.println(amout );
                g++;
            }
        }
    }
}
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        double investment;
//        double rate;
//        int year;
//        System.out.println("Input the investment amount: ");
//        investment = scanner.nextDouble();
//        System.out.println("Input the rate of interest: ");
//        rate = scanner.nextDouble();
//        System.out.println("Input number of years: ");
//        year = scanner.nextInt();
//
//        rate = rate * 0.01;
//        System.out.println("Year    FutureValue");
//
//        for (int i = 0; i <= year; i++) {
//            int formatter = 19;
//            if (i >= 10) formatter = 18;
//            System.out.printf(i + "%"+formatter+".2f\n", futureInvestmentValue(investment, rate/12, i));
//
//        }
//    }
//    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
//        return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
//    }
//}
