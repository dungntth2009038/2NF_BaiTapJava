package data_time_i;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.TimeZone;
import java.util.logging.SimpleFormatter;

public class Q36 {
    public static void main(String[] args) {

        long unix_seconds = 1660009860;
        Date date = new Date(unix_seconds * 1000L);
        SimpleDateFormat jdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z");
        jdf.setTimeZone(TimeZone.getTimeZone("GTM-4"));
        String java_date = jdf.format(date);
        System.out.println(java_date);

    }
}
