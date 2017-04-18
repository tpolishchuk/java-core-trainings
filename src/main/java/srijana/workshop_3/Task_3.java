

// Write a method, which prints today's data to console in given format



package srijana.workshop_3;

/**
 * Created by carmudi on 04/04/2017.
 */






import java.text.SimpleDateFormat;
import java.util.Calendar;

    public class Task_3 {

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


