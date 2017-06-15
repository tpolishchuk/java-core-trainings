package kateryna.workshop_5;

/**
 * Created by kate on 15.06.17.
 */
public class Browser {
    public static void main(String[] args) {
        LoginPage loginPage = new LoginPage("/login");
        loginPage.openPage();
    }
}
