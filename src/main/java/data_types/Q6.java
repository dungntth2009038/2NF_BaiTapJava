package data_types;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        double weight;
        double height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input weight in pounds: ");
        weight = scanner.nextDouble();
        System.out.println("Input height in inches: ");
        height = scanner.nextDouble();
        double bmi = (weight * 0.45359237) / (height * 0.0254 * height * 0.0254);
        System.out.println("Body Mass Index is " +bmi);

    }
}

