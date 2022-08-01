package file_input_output_i;

import java.io.File;

public class Q1 {
    public static void main(String[] args) {
        File file = new File("C:/Users/My pc/OneDrive/Desktop");
        String[] fileList = file.list();
        for (String name: fileList) {
            System.out.println(name);
        }
    }
}
