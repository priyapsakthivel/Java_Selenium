package fundamentals.selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


public class SeleniumEasy1 {


    public static void main(String[] args) throws InterruptedException {

         DriverPath.setDriverPath();

        WebDriver webDriver = new EdgeDriver();
        webDriver.get("https://flipkart.com");
        webDriver.manage().window().maximize();


        WebElement productSearchEl = webDriver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input"));
        productSearchEl.sendKeys("EOS R");
        productSearchEl.sendKeys(Keys.ENTER);



    }
}
