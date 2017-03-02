package zhenya.workshop_5;

public class LoginPage extends BasePage {

    public LoginPage(String partialURL) {
        super(partialURL);
    }

    @Override
    public void showBody(){
        System.out.println("Login form is shown");
    }

}
