import java.sql.Timestamp;
import java.util.Date;

public class TimestampToDate {
    public static void main(String[] args) {
        // Create a Timestamp object representing the current time
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());

        // Create a Date object using the time from the Timestamp object
        Date date = new Date(timestamp.getTime());

        // Print the converted Date object
        System.out.println(date);
    }
}
