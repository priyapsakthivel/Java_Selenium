package fundamentals.amazon;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class AmazonWithoutLogin {
    public static void main(String[] args) throws InterruptedException {
        File file= new File("P:/Webdrivers/edgedriver.exe");
        System.setProperty("webdriver.edge.driver",file.getAbsolutePath());

        WebDriver webDriver= new EdgeDriver();
        webDriver.get("https://www.amazon.in/");
        webDriver.manage().window().maximize();
        WebElement webElement= webDriver.findElement(By.id("twotabsearchtextbox"));
        webElement.sendKeys("table");
        webElement.sendKeys(Keys.ENTER);

        JavascriptExecutor javascriptExecutor= (JavascriptExecutor)webDriver;
        javascriptExecutor.executeScript("scrollTo(0,400)");

        WebElement productChoice = webDriver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div/div[1]/div/span[3]/div[2]/div[3]/div/span/div/div/div/div/span/a"));
        productChoice.click();
        Thread.sleep(2000);

        ArrayList<String> tab = new ArrayList<String>(webDriver.getWindowHandles());
        webDriver.switchTo().window(tab.get(1));
        Thread.sleep(2000);
        javascriptExecutor.executeScript("scrollTo(0,200)");
         WebElement save=webDriver.findElement(By.id("sfl-button"));
         save.click();

        //Thread.sleep(20000);
        //webDriver.quit();

    }
}
