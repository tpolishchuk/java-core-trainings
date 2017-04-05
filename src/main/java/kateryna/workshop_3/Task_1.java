package kateryna.workshop_3;

/**
 * Created by kate on 05.02.17.
 */
public class Task_1 {
    private static void analyzeRedirect(String buttonName){
        switch (buttonName) {
            case "Sign in via email":
                System.out.println(
                        "You have pressed \"" +
                        buttonName +
                        "\". Wait for redirection to your account page"
                );
                break;
            case "Sign in via Facebook":
                System.out.println(
                        "You have pressed \"" +
                        buttonName +
                        "\". Wait for redirection to Facebook"
                );
                break;
            case "Sign in via Google Plus":
                System.out.println(
                        "You have pressed \"" +
                        buttonName +
                        "\". Wait for redirection to Google"
                );
                break;
            default:
                System.out.println(
                        "You have pressed unknown element and system error occurred. " +
                        "Please, contact site administrator"
                );
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
