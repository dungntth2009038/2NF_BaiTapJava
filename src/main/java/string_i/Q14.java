package string_i;

public class Q14 {
    public static void main(String[]args) {
        String str1 = "Stephen Edwin King";
        String str2 = "Walter Winchell";
        String str3 = "stephen edwin king";

        boolean b1 = str1.equalsIgnoreCase(str2);
        boolean b2 = str1.equalsIgnoreCase(str3);
        System.out.println(b1);
        System.out.println(b2);

        System.out.println("\"" + str1 + "\" equals \"" +
                str2 + "\"? " + b1);
        System.out.println("\"" + str1 + "\" equals \"" +
                str3+ "\"? " + b2);
    }
}
