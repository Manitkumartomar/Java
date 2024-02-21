import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateToTimestamp {

    public static void main(String[] args) {
        // Create a new Date object representing the current date and time
        Date date = new Date();

        // Convert the Date object to a Timestamp object
        Timestamp timestamp = new Timestamp(date.getTime());

        // Create a SimpleDateFormat object to format the timestamp
        SimpleDateFormat format = new SimpleDateFormat("dd//MM//yyyy hh:mm:ss");

        // Format the timestamp using the specified format and print it
        System.out.println(format.format(timestamp));
    }
}
