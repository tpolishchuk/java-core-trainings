package kateryna.workshop_5;

/**
 * Created by kate on 15.06.17.
 */
public class BasePage {
    private String BASE_URL;
    private String partialURL;

    public BasePage(String partialURL) {
        this.BASE_URL = "http://www.buycarshere.com";
        this.partialURL = partialURL;
    }

    private void showHeader() {
        System.out.println("Page header is shown");
    }

    private void showFooter() {
        System.out.println("Page footer is shown " + "\n");
    }

    public void showBody() {
        System.out.println("Page body is shown");
    }

    public String getPartialURL() {
        return partialURL;
    }

    public void setPartialURL(String partialURL) {
        this.partialURL = partialURL;
    }

    public void openPage() {
        System.out.println("You are visiting " + BASE_URL + partialURL);
        showHeader();
        showBody();
        showFooter();
    }
}
