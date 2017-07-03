/* Imagine that you have a login form with 3 buttons:
        - "Sign in via email", which redirects to user's account page
        - "Sign in via Facebook", which redirects to facebook.com to grab FB session
        - "Sign in via Google Plus", which redirects to google.com to grab Google session

        You need to create a method, which uses switch statement, takes button name as argument and tells user where he will be
        redirected. */





package srijana.workshop_3;

public class Task_1 {

    public static void main(String[] args) {
        analyzeRedirect("Sign in via email");
        analyzeRedirect("Sign in via Facebook");
        analyzeRedirect("Sign in via Google Plus");
        analyzeRedirect("Lorem Ipsum");
    }

    private static void analyzeRedirect(String buttonName){
        switch (buttonName) {
            case "Sign in via email":
                System.out.println( "You have pressed \""+ buttonName + "\". Wait for redirection to your account page");
                break;
            case "Sign in via Facebook":
                System.out.println("You have pressed \"" + buttonName + "\". Wait for redirection to Facebook");
                break;
            case "Sign in via Google Plus":
                System.out.println("You have pressed \"" + buttonName + "\". Wait for redirection to Google");
                break;
            default:
                System.out.println(
                        "You have pressed unknown element and system error occurred. " + "Please, contact site administrator");
                break;
        }

    }



}


/*Pattern p = Pattern.compile("[0-9]");
Matcher m = p.matcher(text);

        while(m.find()) {
                System.out.println("Digit found " + m.group());


                }


                Pattern replace = Pattern.compile("\\w+");
                Matcher matcher2 = replace.matcher(EXAMPLE_TEST);
                System.out.println(matcher2.replaceAll("\\w+"));*/

