package zhenya.workshop_5;

public class BasePage {

    private final String BASE_URL = "http://www.buycarshere.com";

    String partialURL;

    private void setPartialURL(String partialURL) {
   //     this.partialURL = partialURL;
        this.partialURL = BASE_URL+partialURL;
    }

    private String getPartialURL() {
        return partialURL;
    }

    private void showHeader() {
        System.out.println("Page header is shown");
    }

    private void showFooter(){
        System.out.println("Page footer is shown");
    }

    private void showBody(){
        System.out.println("Page body is shown");
    }

    public void openPage(){
        setPartialURL("/faq");
        System.out.println("User is on page: "+ getPartialURL());
        showHeader();
        showBody();
        showFooter();
    }
}
