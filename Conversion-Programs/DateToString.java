import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateToString {
    public static void main(String[] args) {
        // Get the current date and time
        Date date = Calendar.getInstance().getTime();

        // Print an empty line for spacing
        System.out.println();

        // Print the original date object
        System.out.println("Date: " + date);

        // Print a separator line for clarity
        System.out.println("===========================");

        // Define the date format
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd  hh:mm:ss");

        // Convert the date object to a string with the specified format
        String sDate = dateFormat.format(date);

        // Print the converted string
        System.out.println("Converted String: " + sDate);

        // Print an empty line for spacing
        System.out.println();
    }
}
