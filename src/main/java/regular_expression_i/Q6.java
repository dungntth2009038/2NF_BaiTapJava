package regular_expression_i;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q6 {
    public static void main(String[] args) {
        System.out.println(validate("go"));
        System.out.println(validate("teacher "));
        System.out.println(validate("god"));
    }

    public static String validate(String text) {
        Pattern pattern = Pattern.compile("\\w*g.\\w*");
        Matcher m = pattern.matcher(text);

        if (m.find())
            return "Tìm thấy g";
        else
            return "Không tìm thấy g";
    }
}
