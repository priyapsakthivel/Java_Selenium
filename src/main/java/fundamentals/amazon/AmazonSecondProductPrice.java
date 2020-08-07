package fundamentals.amazon;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.util.ArrayList;


public class AmazonSecondProductPrice {
    public static void main(String[] args) {
        File file= new File("P:/Webdrivers/edgedriver.exe");
        System.setProperty("webdriver.edge.driver",file.getAbsolutePath());
        WebDriver driver= new EdgeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        WebElement searchBox=driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("table");
        searchBox.sendKeys(Keys.ENTER);
        JavascriptExecutor jse= (JavascriptExecutor)driver;
        jse.executeScript("scrollTo(0,200)");
        WebElement secondProduct=driver.findElement(By.xpath("//*[@id=\"anonCarousel1\"]/ol/li[2]/div/div/span/a"));
        secondProduct.click();
        ArrayList<String> tab=new ArrayList <String> (driver.getWindowHandles());
        driver.switchTo().window(tab.get(1));
        WebElement price=driver.findElement(By.id("priceblock_dealprice"));
        String netprice=price.getText();

        System.out.println("price of table ="+netprice);






    }
}
