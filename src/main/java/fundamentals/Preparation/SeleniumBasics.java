package fundamentals.Preparation;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;

public class SeleniumBasics {
    public static void main(String[] args) {
        SeleniumBasics obj = new SeleniumBasics();
        obj.browser();
        obj.browserAppearance();
    }
    public void browser(){
        File file = new File("P:/Webdrivers/edgedriver.exe");
        System.setProperty("webdriver.edge.driver",file.getAbsolutePath());
        WebDriver driver= new EdgeDriver();
        driver.get("https://www.flipkart.com/");
    }
    public void browserAppearance(WebDriver driver){
       driver.manage().window().maximize();
        JavascriptExecutor jse= (JavascriptExecutor)WebDriver;
    }
}
