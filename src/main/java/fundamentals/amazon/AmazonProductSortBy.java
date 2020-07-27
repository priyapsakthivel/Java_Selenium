package fundamentals.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;

public class AmazonProductSortBy {
    public static void main(String[] args) {
        File file= new File("P:/Webdrivers/edgedriver.exe");
        System.setProperty("webdriver.edge.driver",file.getAbsolutePath());

        WebDriver webDriver=new EdgeDriver();
        webDriver.get("https://www.amazon.in/

    }
}
