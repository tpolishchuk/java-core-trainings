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

    public void showHeader() {
        System.out.println("Page header is shown");
    }

    public void showFooter() {
        System.out.println("Page footer is shown");
    }

    public void showBody() {
        System.out.println("Page body is shown");
    }

    public void openPage() {
        System.out.println("You are visiting " + BASE_URL + partialURL);
        showHeader();
        showBody();
        showFooter();
    }
}
