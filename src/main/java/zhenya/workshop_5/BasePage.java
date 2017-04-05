package zhenya.workshop_5;

public class BasePage {

    private final String BASE_URL = "http://www.buycarshere.com";

    String partialURL;

    public BasePage(String partialURL) {
        this.partialURL = partialURL;
    }

    private void setPartialURL(String partialURL) {
        this.partialURL = partialURL;
    }

    private String getPartialURL() {
        return partialURL;
    }

    private void getCurrentURL(String partialURL) {
        setPartialURL(partialURL);
        System.out.println("User is on page: " + BASE_URL + getPartialURL());
    }

    private void showHeader() {
        System.out.println("Page header is shown");
    }

    private void showFooter() {
        System.out.println("Page footer is shown");
    }

    public void showBody() {
        System.out.println("Page body is shown");
    }

    public void openPage() {
        getCurrentURL(partialURL);
        showHeader();
        showBody();
        showFooter();
        System.out.println("\n");
    }
}
