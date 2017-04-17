package zhenya.workshop_8;

public class Console {

    public static void main(String[] args) {

        //The main purpose of the task is to create 3 different loggers: error logger, info logger and debug logger.
        //Each logger will print logs in accordance with its style. Feel free to set any style you want

        InfoLogger infoLogger = new InfoLogger();
        ErrorLogger errorLogger = new ErrorLogger();
        DebugLogger debugLogger = new DebugLogger();

        infoLogger.print("This is info message 1");
        errorLogger.print("This is error message 1");
        debugLogger.print("This is debug message 1");

        infoLogger.print("This is info message 2");
        errorLogger.print("This is error message 2");
        debugLogger.print("This is debug message 2");
    }
}
