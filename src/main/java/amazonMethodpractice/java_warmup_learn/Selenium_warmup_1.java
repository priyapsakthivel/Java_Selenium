package amazonMethodpractice.java_warmup_learn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;

public class Selenium_warmup_1 {
    public static void main(String[]args){
      File file= new File("P:\\Webdrivers\\msedgedriver.exe");
      System.setProperty("webdriver.edge.driver",file.getAbsolutePath());
      WebDriver driver= new EdgeDriver();
      driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
      driver.manage().window().maximize();
      driver.findElement(By.id("at-cv-lightbox-close")).click();
      driver.findElement(By.id("user-message")).sendKeys("All the best for the day");

    }
}
