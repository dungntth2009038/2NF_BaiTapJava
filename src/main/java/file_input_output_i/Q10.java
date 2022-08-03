package file_input_output_i;

import java.io.*;

public class Q10 {
        public static void main(String[] args) throws FileNotFoundException, IOException {
            File file = new File("C:\\Users\\admin\\Desktop\\test.txt");
            FileInputStream fis = new FileInputStream(file);
            byte c;
            while((c = (byte)fis.read()) != -1){
                System.out.print((char)c);
            }
        }
    }
