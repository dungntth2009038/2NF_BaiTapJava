package regular_expression_i;

public class Q16 {
    public static void main(String[] args) {
        String text = "LOWERED";
        System.out.println("Original string: "+text);
        System.out.println("After replacing vowel(s) with specified Character: "+validate(text, '#'));
        text = "Java";
        System.out.println("Original string: "+text);
        System.out.println("After replacing vowel(s) with specified Character: "+validate(text, '*'));
        text = "MID-CENTRALIZED";
        System.out.println("Original string: "+text);
        System.out.println("After replacing vowel(s) with specified Character: "+validate(text, '^'));
        text = "C++";
        System.out.println("Original string: "+text);
        System.out.println("After replacing vowel(s) with specified Character: "+validate(text, '@'));
    }

    public static String validate(String text, char chr) {
        return text.replaceAll("[aeiouAEIOU]", "" + chr);
    }
}
