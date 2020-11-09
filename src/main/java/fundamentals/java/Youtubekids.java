package fundamentals.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;

public class Youtubekids {
    public static void main(String[]args) throws InterruptedException {
        File file = new File("P:\\Webdrivers\\msedgedriver.exe");
        System.setProperty("webdriver.edge.driver",file.getAbsolutePath());
        Youtubekids youtubekids= new Youtubekids();
        WebDriver webDriver =youtubekids.launch();
        youtubekids.fullscreen(webDriver);
        youtubekids.parent(webDriver);
    }
    public WebDriver launch(){
        WebDriver driver= new EdgeDriver();
        driver.get("https://www.youtubekids.com/");
        return driver;
    }
    public void fullscreen(WebDriver webDriver) throws InterruptedException {
        webDriver.manage().window().maximize();
        Thread.sleep(2000);
    }
    public void parent(WebDriver webDriver) throws InterruptedException {
        webDriver.findElement(By.id("parent-button")).click();
        Thread.sleep(2000);
        webDriver.findElement(By.id("next-button")).click();
        Thread.sleep(2000);
        webDriver.findElement(By.id("digits-input")).sendKeys("1997");
        webDriver.findElement(By.id("submit-button")).click();
        Thread.sleep(200);

    }
}
