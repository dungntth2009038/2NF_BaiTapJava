package regular_expression_i;

public class Q19 {
    public static String validate(String text){
        String s = text.replaceAll("(?i)[pqr]","");
        return text.equals(s) ? "Not found" : s;
    }

    public static void main(String[] args) {
        String text = "phương trình";
        System.out.println("Original Text :"+text);
        System.out.println("Remove p,q,r characters from the said string(if present): "+validate(text));

        text = "running";
        System.out.println("Original Text :"+text);
        System.out.println("Remove p,q,r characters from the said string(if present): "+validate(text));

        text = "quả táo";
        System.out.println("Original Text :"+text);
        System.out.println("Remove p,q,r characters from the said string(if present): "+validate(text));
    }
}
