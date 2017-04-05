package zhenya.workshop_3;

public class Task1 {

    private static String buttonEmail = "Sign in via email";
    private static String buttonFB = "Sign in via Facebook";
    private static String buttonGoogle = "Sign in via Google Plus";

    public static void main(String[] args) {
        analyzeRedirect(buttonEmail);
        analyzeRedirect(buttonFB);
        analyzeRedirect(buttonGoogle);
        analyzeRedirect("Lorem Ipsum");
    }

    private static void clickEmail() {
        System.out.println("You have pressed \"Sign in via email\". Wait for redirection to your account page");
    }

    private static void clickFB() {
        System.out.println("You have pressed \"Sign in via Facebook\". Wait for redirection to Facebook");
    }

    private static void clickGoogle() {
        System.out.println("You have pressed \"Sign in via Google Plus\". Wait for redirection to Google");
    }

    private static void clickUnknown() {
        System.out.println("You have pressed unknown element and system error occurred. Please, contact site administrator");
    }

    private static void analyzeRedirect(String buttonName) {
        switch (buttonName) {
            case "Sign in via email":
                clickEmail();
                break;
            case "Sign in via Facebook":
                clickFB();
                break;
            case "Sign in via Google Plus":
                clickGoogle();
                break;
            default:
                clickUnknown();
                break;
        }
    }
}
