package fundamentals.amazon;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;


public class AmazonSecondProductPrice {
    public static void main(String[] args) throws InterruptedException {

        File file= new File("P:/Webdrivers/msedgedriver.exe");
        System.setProperty("webdriver.edge.driver",file.getAbsolutePath());
        WebDriver driver= new EdgeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        WebElement searchBox=driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("table");
        searchBox.sendKeys(Keys.ENTER);
        JavascriptExecutor jse= (JavascriptExecutor)driver;
        jse.executeScript("scrollTo(0,200)");
        Thread.sleep(2000);
        WebElement secondProduct=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div/div[1]/div/span[3]/div[2]/div[4]/div/span/div/div/div/div/div[2]/h2/a"));
        secondProduct.click();
        ArrayList<String> tab=new ArrayList <String> (driver.getWindowHandles());
        driver.switchTo().window(tab.get(1));
        Thread.sleep(2000);

        WebElement price=driver.findElement(By.id("priceblock_saleprice"));
        String netprice=price.getText();
        Thread.sleep(2000);

        System.out.println("price of table ="+netprice);
        Thread.sleep(3000);
        driver.quit();
    }
}
