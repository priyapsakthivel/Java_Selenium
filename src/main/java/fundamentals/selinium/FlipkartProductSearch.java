package fundamentals.selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;

public class FlipkartProductSearch {


    public static void main(String[] args) throws InterruptedException {
        File file = new File("P:/Webdrivers/edgedriver.exe");
        System.setProperty("webdriver.edge.driver",file.getAbsolutePath());

        WebDriver driver= new EdgeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
       WebElement productSearch= driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input"));
        productSearch.sendKeys("table");
        productSearch.sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
        Thread.sleep(3000);
        driver.close();




    }
}
