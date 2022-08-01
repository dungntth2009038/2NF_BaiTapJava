package data_time_i;

import java.time.Year;

public class Q25 {
    public static void main(String[] args) {
        Year year = Year.now();
        System.out.println("Current Year: "+year);
        boolean isLeap = year.isLeap();
        System.out.println("Is current year leap year? "+isLeap);
        int days = year.length();
        System.out.println("Length of the year: " + days + " days");
    }
}
