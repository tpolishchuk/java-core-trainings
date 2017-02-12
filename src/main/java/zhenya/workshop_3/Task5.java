package zhenya.workshop_3;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Task5 {

    public static void main(String[] args) {
        printCurrentData("HH:mm:ss");
        printCurrentData("MM/dd/yy");
    }

    private static void printCurrentData(String format) {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        System.out.println(dateFormat.format(calendar.getTime()));
    }
}
