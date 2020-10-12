package amazonMethodpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;

public class Flipkart {
    public static void main(String[]args) throws InterruptedException {
        File file= new File("P:\\Webdrivers\\msedgedriver.exe");
        System.setProperty("webdriver.edge.driver",file.getAbsolutePath());
        Flipkart flipkart= new Flipkart();
        flipkart.flipkartGrocery();
    }
    public void flipkartGrocery() throws InterruptedException {
        WebDriver driver= new EdgeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("poiuytre");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("poiuytf");
        Thread.sleep(2000);

    }

}
