package data_time_i;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Q17 {
    public static void main(String[] args) {
//
        Calendar calendar = Calendar.getInstance();
        Date now_date = calendar.getTime();
        calendar.add(Calendar.YEAR,1);
        Date after_year = calendar.getTime();
        calendar.add(Calendar.YEAR,-2);
        Date before_year = calendar.getTime();
        System.out.println("\nCurrent Date : " + now_date);
        System.out.println("\nDate before 1 year : " + before_year);
        System.out.println("\nDate after 1 year  : " + after_year+"\n");

    }
}
