package fundamentals.Preparation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;

/**
 * Program objective is to understand the principles of method
 */
public class SeliniumMethodTraining {

    public static void main(String[] args) {
        SeliniumMethodTraining seliniumMethodTraining = new SeliniumMethodTraining();
        WebDriver webDriver = seliniumMethodTraining.getDriverObject();
        seliniumMethodTraining.openAWebsite(webDriver);
        String result = seliniumMethodTraining.getTextExampleMethod(webDriver).getText();
        System.out.println(result);

    }

    public WebDriver getDriverObject(){
        File file = new File("P:/Webdrivers/edgedriver.exe");
        System.setProperty("webdriver.edge.driver",file.getAbsolutePath());
        WebDriver driver = new EdgeDriver();
        return driver;
    }

    public void openAWebsite(WebDriver webDriver){
        webDriver.get("https://www.flipkart.com");
    }

    public WebElement getTextExampleMethod(WebDriver webDriver){
        return webDriver.findElement(By.id("display"));
    }


}
