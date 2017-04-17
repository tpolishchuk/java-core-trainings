package zhenya.workshop_8;

public class InfoLogger extends Logger {

    @Override
    public void print (String message){
        loggerStyle = new LoggerStyle("yellow", "blue", "");
        super.print(loggerStyle.adjustedColor(loggerStyle) + currentDate() + " " + logType.INFO + " " + message);
    }
}
