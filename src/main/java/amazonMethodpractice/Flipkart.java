package amazonMethodpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;

public class Flipkart {
    public static void main(String[]args){
        File file= new File("P:\\Webdrivers\\msedgedriver.exe");
        System.setProperty("webdriver.edge.driver",file.getAbsolutePath());
        Flipkart flipkart= new Flipkart();
        flipkart.flipkartGrocery();
    }
    public void flipkartGrocery(){
        WebDriver driver= new EdgeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/a[3]")).click();

    }

}
