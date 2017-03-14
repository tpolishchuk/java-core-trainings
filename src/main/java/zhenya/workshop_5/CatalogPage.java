package zhenya.workshop_5;

public class CatalogPage extends BasePage {

    public CatalogPage(String partialURL) {
        super(partialURL);
    }

    @Override
    public void openPage() {
        if (partialURL.equals("/cars") || partialURL.equals("/motorcycles") ||
                partialURL.equals("/commercial-vehicles") || partialURL.equals("/all")) {
            super.openPage();
        } else {
            System.out.println("Cannot handle given partial url " + partialURL + ", page will not be shown");
        }
    }

    @Override
    public void showBody() {
        switch (partialURL) {
            case "/cars":
                System.out.println("Cars catalog is shown");
                break;
            case "/motorcycles":
                System.out.println("Motorcycles catalog is shown");
                break;
            case "/commercial-vehicles":
                System.out.println("Commercial vehicles catalog is shown");
                break;
            case "/all":
                System.out.println("All vehicles catalog is shown");
                break;
            default:
                break;
        }
    }
}
