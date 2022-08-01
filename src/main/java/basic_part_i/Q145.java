package basic_part_i;

import java.util.ArrayList;

public class Q145 {
    public static void main(String[] args) {
        ArrayList<Integer> numBer = new ArrayList<Integer>();
        numBer.add(1);
        numBer.add(2);
        numBer.add(3);
        numBer.add(4);
        numBer.add(5);
        System.out.println(numBer);
        numBer.remove(3);
        System.out.println(numBer);

    }
}
