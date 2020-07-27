package fundamentals.amazon;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;

import javax.print.DocFlavor;
import java.io.File;

public class AmazonProductSortBy {
    public static void main(String[] args) throws InterruptedException {
        File file= new File("P:/Webdrivers/edgedriver.exe");
        System.setProperty("webdriver.edge.driver",file.getAbsolutePath());

        WebDriver webDriver=new EdgeDriver();
        webDriver.get("https://www.amazon.in/");
        webDriver.manage().window().maximize();
        WebElement searchbox= webDriver.findElement(By.id("twotabsearchtextbox"));
        searchbox.sendKeys("samsunglevelu");
        searchbox.sendKeys(Keys.ENTER);

        JavascriptExecutor javascriptExecutor= (JavascriptExecutor)webDriver;
        javascriptExecutor.executeScript("ScrollTo(0,200)");

        WebElement productChoice = webDriver.findElement(By.id("s-result-sort-select"));
        productChoice.click();
        Thread.sleep(2000);

    }
}
