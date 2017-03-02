package zhenya.workshop_5;

public class Browser extends BasePage {

    public Browser(String partialURL) {
        super(partialURL);
    }

    public static void main(String[] args) {
        LoginPage loginPage = new LoginPage("/login");
        loginPage.openPage();

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
