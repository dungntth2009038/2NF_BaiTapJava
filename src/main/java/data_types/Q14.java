package data_types;

import java.math.BigInteger;

public class Q14 {
    public static void main(String[] args) {
        BigInteger bigInteger = BigInteger.valueOf(Long.MAX_VALUE);
        System.out.println("BigInteger " +bigInteger);

        byte big_Byte = bigInteger.byteValue();
        System.out.println("Convert BigInteger to byte : "+big_Byte);
        short big_Short = bigInteger.shortValue();
        System.out.println("Convert BigInteger to short : "+big_Short);
        int big_Int = bigInteger.intValue();
        System.out.println("Convert BigInteger to int : "+big_Int);
        long big_Long = bigInteger.longValue();
        System.out.println("Convert BigInteger to long : "+big_Long);
        float big_Float = bigInteger.floatValue();
        System.out.println("Convert BigInteger to float : "+big_Float);
        double big_Double = bigInteger.doubleValue();
        System.out.println("Convert BigInteger to double : "+big_Double);
//        Boolean big_Bolean = bigInteger.BoleanValue();      không thể sử dụng boolean, char trong BigInteger
//        char big_Char = bigInteger.charValue();
    }
}
