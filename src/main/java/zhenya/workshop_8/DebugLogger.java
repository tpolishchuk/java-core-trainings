package zhenya.workshop_8;

public class DebugLogger extends Logger {

    @Override
    public void print(String message) {
        loggerStyle = new LoggerStyle("green", "black", "");
        super.print(loggerStyle.adjustedColor(loggerStyle) + currentDate() + " " + logType.DEBUG + " " + message);
    }
}
