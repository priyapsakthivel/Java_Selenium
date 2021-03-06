package amazonMethodpractice.java_warmup_learn;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;

public class Selenium_warmup_1 {
    public static void main(String[]args) throws InterruptedException {
      File file = new File("P:\\Webdrivers\\msedgedriver.exe");
      System.setProperty("webdriver.edge.driver", file.getAbsolutePath());
      WebDriver driver = new EdgeDriver();
      driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
      Selenium_warmup_1 selenium_warmup_1 = new Selenium_warmup_1();
      selenium_warmup_1.launch(driver);
      selenium_warmup_1.message(driver);
      selenium_warmup_1.displayed_message(driver);
    }
    public void launch(WebDriver driver) {
      driver.manage().window().maximize();
      driver.findElement(By.id("at-cv-lightbox-close")).click();
      driver.findElement(By.id("user-message")).sendKeys("All the best for the day");
    }
    public void message(WebDriver driver) throws InterruptedException {
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("scrollTo(0,210)");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"get-input\"]/button")).click();
    }
    public void displayed_message(WebDriver driver){
      String message=driver.findElement(By.id("display")).getText();
      System.out.println(message);
    }
}
