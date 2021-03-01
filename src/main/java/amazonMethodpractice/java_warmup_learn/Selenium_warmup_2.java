package amazonMethodpractice.java_warmup_learn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;

public class Selenium_warmup_2 {
    public static void main(String[]args){
        File file= new File("P:\\Webdrivers\\msedgedriver.exe");
        System.setProperty("webdriver.edge.driver",file.getAbsolutePath());
        WebDriver driver= new EdgeDriver();
        Selenium_warmup_2 obj= new Selenium_warmup_2();
        obj.launching(driver);
    }
    public void launching(WebDriver driver) throws InterruptedException {
        driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
        driver.manage().window().maximize();
        Thread.sleep(2000);


    }
}
