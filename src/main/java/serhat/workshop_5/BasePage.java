package serhat.workshop_5;

import com.sun.corba.se.impl.orbutil.closure.Constant;
import com.sun.tools.javac.code.Attribute;

/**
 * Created by serhatgemici on 28/02/2017.
 */
public class BasePage {

    protected static final String BASE_URL = "http://www.buycarshere.com";
    protected static String partialURL;

    protected BasePage(String partialURL) {
        this.partialURL = partialURL;
    }

    protected void showHeader() {

        System.out.println("Page header is shown");

    }

    protected void showFooter() {

        System.out.println("Page footer is shown");

    }

    protected void showBody() {

        System.out.println("Page body is shown");

    }

    protected void openPage() {

        System.out.println("Opening URL: " + BASE_URL + partialURL);
        showHeader();
        showBody();
        showFooter();
    }

    public static String getBaseUrl() {
        return BASE_URL;
    }

    public static String getPartialURL() {
        return partialURL;
    }

    public static void setPartialURL(String partialURL) {
        BasePage.partialURL = partialURL;
    }
    
}
