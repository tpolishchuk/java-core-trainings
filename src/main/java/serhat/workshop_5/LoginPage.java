package serhat.workshop_5;

import com.sun.xml.internal.rngom.parse.host.Base;

/**
 * Created by serhatgemici on 04.04.17.
 */
public class LoginPage extends BasePage {

    public LoginPage(String partialURL) {

        super(partialURL);
    }

    protected static void showLoginForm() {
        System.out.println("login form is shown");
    }

    @Override
    public void openPage() {
        showHeader();
        showLoginForm();
        showFooter();
        System.out.println("***");

    }
}
