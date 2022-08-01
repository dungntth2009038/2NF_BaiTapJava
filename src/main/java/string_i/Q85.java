package string_i;

public class Q85 {
    public static void main(String[] arg) {

        String str = "weablcoabmeab";
        String new_str = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' && str.charAt(i + 1) == 'b') {
                if (i != 0) {
                    new_str += str.charAt(i - 1);
                }
                if (i < str.length() - 2) {
                    new_str += str.charAt(i + 2);
                }
            }
        }
        System.out.println("The given string are: " + str + " and" + " ab");
        System.out.println("The new string is: " + new_str);
    }
}

