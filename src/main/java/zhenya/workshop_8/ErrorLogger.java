package zhenya.workshop_8;

public class ErrorLogger extends Logger {

    @Override
    public void print(String message) {
        loggerStyle = new LoggerStyle("black", "red", "");
        super.print(loggerStyle.adjustedColor(loggerStyle) + currentDate() + " " + logType.ERROR + " " + message);
    }
}
