package data_time_i;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Q9 {
    public static void main(String[] args) {
        // lấy ra ngày hiện tại
        Calendar c = Calendar.getInstance();

        // đặt thành lịch thứ 2 của tuần này.
        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        // In ra các ngày trong tuần bắt đầu từ thứ 2
        DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
        System.out.println(df.format(c.getTime()));
        for (int i = 0; i < 6; i++) {
            c.add(Calendar.DATE, 1);
        }
        System.out.println(df.format(c.getTime()));
        System.out.println();
    }
}
