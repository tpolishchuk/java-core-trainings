package zhenya.workshop_8;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Logger {
    protected LoggerStyle loggerStyle = new LoggerStyle("yellow", "blue", "");
    protected LogType logType;
    private String simpleDateFormat = "[HH:mm:ss]";

    public Logger() {
        System.out.println(getClass().getSimpleName() + " was created");
    }

    protected String currentDate() {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat(simpleDateFormat);
        return dateFormat.format(calendar.getTime());
    }

    public void print(String message) {
        System.out.println(message);
    }
}
