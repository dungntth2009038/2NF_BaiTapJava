package math_i;

public class Q2 {
    public static void main(String[] args) throws Exception {
        double a = 12.56;
        System.out.println("Original value: " + a);
        double fraqtional = a % 1;
        double integer = a - fraqtional;
        System.out.println("Integral part: " + integer);
        System.out.println("Fractional part: " + fraqtional);
    }
}