package serhat.workshop_3;

/**
 * Created by serhatgemici on 07/02/2017.
 */
public class Task1 {

    private static void analyzeRedirect(String buttonName) {

        switch (buttonName) {
            case "Sign in via email":
                System.out.println(" You have pressed \"Sign in via email\". Wait for redirection to your account page");
                break;

            case "Sign in via Facebook":
                System.out.println("You have pressed \"Sign in via Facebook\". Wait for redirection to Facebook");
                break;

            case "Sign in via Google Plus":
                System.out.println("You have pressed \"Sign in via Google Plus\". Wait for redirection to Google");
                break;

            case "Lorem Ipsum":
                System.out.println("You have pressed unknown element and system error occurred. Please, contact site administrator");
                break;
        }
    }

    public static void main(String[] args) {
        analyzeRedirect("Sign in via email");
        analyzeRedirect("Sign in via Facebook");
        analyzeRedirect("Sign in via Google Plus");
        analyzeRedirect("Lorem Ipsum");
    }
}
