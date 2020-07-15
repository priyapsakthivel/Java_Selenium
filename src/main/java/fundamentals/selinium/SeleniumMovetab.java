package fundamentals.selinium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.util.Set;

public class SeleniumMovetab {
    public static void main(String[] args) {
        DriverPath.setDriverPath();
        WebDriver webDriver= new EdgeDriver();
        webDriver.get("https://stackoverflow.com/questions/12729265/switch-tabs-using-selenium-webdriver-with-java");
        JavascriptExecutor obj = new EdgeDriver();
        obj.executeScript("window.open('http://www.flipkart.com')");
         webDriver.switchTo().window("1");

        Set<String> oldTab = webDriver.getWindowHandles();
        System.out.println(oldTab);



    }
}
