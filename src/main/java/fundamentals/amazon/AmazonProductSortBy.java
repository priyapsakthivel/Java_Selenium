package fundamentals.amazon;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import javax.print.DocFlavor;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

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
        Thread.sleep(2000);
        WebElement productChoice = webDriver.findElement(By.xpath("//*[@id=\"a-autoid-0-announce\"]/span[2]"));
        productChoice.click();
        Thread.sleep(2000);

       Select list= new Select (webDriver.findElement(By.id("s-result-sort-select")));
       list.selectByValue("price-asc-rank");

    }
}
