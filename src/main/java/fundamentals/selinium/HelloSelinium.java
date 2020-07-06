package fundamentals.selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;

public class HelloSelinium {

    public static void main(String[] args) {
        DriverPath.setDriverPath();

        WebDriver driver = new EdgeDriver();

        String appUrl = "https://flipkart.com";

        driver.get(appUrl);

        driver.manage().window().maximize();

        driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();

        WebElement searchElement = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input"));
        searchElement.sendKeys("Table");
        searchElement.submit();




    }
}
