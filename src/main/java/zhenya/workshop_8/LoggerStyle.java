package zhenya.workshop_8;

public class LoggerStyle {
    private String textColor;
    private String backgroundColor;
    private String resetColor;

    private String getTextColor() {
        return textColor;
    }

    private void setTextColor(String textColor) {
        switch (textColor) {
            case "black":
                textColor = "30";
                break;
            case "red":
                textColor = "31";
                break;
            case "green":
                textColor = "32";
                break;
            case "blue":
                textColor = "34";
                break;
            case "yellow":
                textColor = "33";
                break;
            default:
                textColor = "";
                break;
        }
        this.textColor = textColor;
    }

    private String getBackgroundColor() {
        return backgroundColor;
    }

    private void setBackgroundColor(String backgroundColor) {
        switch (backgroundColor) {
            case "black":
                backgroundColor = "40";
                break;
            case "red":
                backgroundColor = "41";
                break;
            case "blue":
                backgroundColor = "44";
                break;
            case "yellow":
                backgroundColor = "43";
                break;
            default:
                backgroundColor = "";
                break;
        }
        this.backgroundColor = backgroundColor;
    }

    private String getResetColor() {
        return resetColor;
    }

    private void setResetColor(String resetColor) {
        this.resetColor = resetColor;
    }

    public LoggerStyle(String textColor, String backgroundColor, String resetColor) {
        setTextColor(textColor);
        setBackgroundColor(backgroundColor);
        setResetColor(resetColor);
    }

    public String adjustedColor(LoggerStyle loggerStyle) {
        String adjustment;
        if (loggerStyle.getTextColor() != "" || loggerStyle.getBackgroundColor() != "") {
            adjustment = (char) 27 + "[" + loggerStyle.getTextColor() + ";"
                         + loggerStyle.getBackgroundColor() + "m";
        }
        else {
            adjustment = "";
        }
        return adjustment;
    }

}
