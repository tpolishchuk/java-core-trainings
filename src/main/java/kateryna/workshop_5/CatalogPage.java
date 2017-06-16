package kateryna.workshop_5;

/**
 * Created by kate on 15.06.17.
 */
public class CatalogPage extends BasePage {

    public CatalogPage(String partialURL) {
        super(partialURL);
    }

    private String currentPartialURL = getPartialURL();

    @Override
    public void openPage() {
        if (currentPartialURL.equals("/cars") || currentPartialURL.equals("/motorcycles")
                || currentPartialURL.equals("/commercial-vehicles") || currentPartialURL.equals("/all")) {
        super.openPage();
        } else System.out.println("Cannot handle given partial URL " + currentPartialURL + ", page will not be shown");

    }

    @Override
    public void showBody() {
        if (currentPartialURL.equals("/cars")) {
            System.out.println("Cars catalog is shown");
        } else if (currentPartialURL.equals("/motorcycles")) {
            System.out.println("Motorcycles catalog is shown");
        } else if (currentPartialURL.equals("/commercial-vehicles")) {
            System.out.println("Commercial vehicles catalog is shown");
        } else if (currentPartialURL.equals("/all")) {
            System.out.println("All vehicles are shown in catalog");
        }
    }
}
