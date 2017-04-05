package serhat.workshop_5;

/**
 * Created by serhatgemici on 05.04.17.
 */
public class CatalogPage extends BasePage {

    protected CatalogPage(String partialURL) {
        super(partialURL);
    }

    @Override
    protected void openPage() {
       if (partialURL.equals("/cars")) {
            System.out.println("Opening URL: " + BASE_URL + partialURL);
            showHeader();
            System.out.println("cars catalog is shown");
            showFooter();
            System.out.println("***\n");
        } else if (partialURL.equals("/motorcycles")) {
            System.out.println("Opening URL: " + BASE_URL + partialURL);
            showHeader();
            System.out.println("motorcycles catalog is shown");
            showFooter();
            System.out.println("***\n");
        } else if (partialURL.equals("/commercial-vehicles")) {
            System.out.println("Opening URL: " + BASE_URL + partialURL);
            showHeader();
            System.out.println("commercial-vehicles catalog is shown");
            showFooter();
            System.out.println("***\n");
        } else if (partialURL.equals("/all")) {
            System.out.println("Opening URL: " + BASE_URL + partialURL);
            showHeader();
            System.out.println("All Vehicles catalog is shown");
            showFooter();
            System.out.println("***\n");
        }
    }
}
