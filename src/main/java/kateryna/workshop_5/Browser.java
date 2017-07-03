package kateryna.workshop_5;

/**
 * Created by kate on 15.06.17.
 */
public class Browser {
//    public static void main(String[] args) {
//        LoginPage loginPage = new LoginPage("/login");
//        loginPage.openPage();

    public static void main(String[] args) {
        CatalogPage catalogPage = new CatalogPage("/cars");
        catalogPage.openPage();
        catalogPage = new CatalogPage("/motorcycles");
        catalogPage.openPage();
        catalogPage = new CatalogPage("/commercial-vehicles");
        catalogPage.openPage();
        catalogPage = new CatalogPage("/all");
        catalogPage.openPage();
        catalogPage = new CatalogPage("/sellcar");
        catalogPage.openPage();
    }
}
