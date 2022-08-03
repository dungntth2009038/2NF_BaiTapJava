package collection_i;

import java.util.ArrayList;

public class Q2 {
    public static void main(String[] args) {
        ArrayList<String> color = new ArrayList<>();
        color.add("red");
        color.add("blue");
        color.add("green");
        color.add("violet");
        color.add("gold");
        for (String i : color) {
            System.out.println(i);
        }
    }
}
