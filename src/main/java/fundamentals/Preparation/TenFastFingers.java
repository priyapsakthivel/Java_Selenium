package fundamentals.Preparation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.util.List;

public class TenFastFingers {
    public static void main(String[]args) throws InterruptedException {
    TenFastFingers tenFastFingers= new TenFastFingers();
    WebDriver driver =tenFastFingers.launchWebPage("https://10fastfingers.com/multiplayer");
    Thread.sleep(5000);
    driver.findElement(By.id("username")).sendKeys("test");
    driver.findElement(By.xpath("//*[@id='auth']/input[2]")).click();
//        tenFastFingers.typeTest(driver);
    }

    public void typeTest(WebDriver driver) throws InterruptedException {
        List<WebElement> paraList =driver.findElements(By.xpath("//*[@id='row1']//*"));
        for (WebElement webElement : paraList) {
            String word= webElement.getText();
            driver.findElement(By.id("inputfield")).sendKeys(word+" ");
            Thread.sleep(500);
        }
    }

   public WebDriver launchWebPage(String url){
       File file= new File("P:/Webdrivers/msedgedriver.exe");
       System.setProperty("webdriver.edge.driver",file.getAbsolutePath());
       WebDriver driver= new EdgeDriver();
       driver.get(url);
       driver.manage().window().maximize();
       driver.manage().deleteAllCookies();
       return driver;
   }


   public void login(WebDriver driver){
        driver.findElement(By.id("UserEmail")).sendKeys("mohanrajn.india@gmail.com");
       driver.findElement(By.id("UserPassword")).sendKeys("Welcome@123");
       driver.findElement(By.id("login-form-submit")).click();
   }


}
