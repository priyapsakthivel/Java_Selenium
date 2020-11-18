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
        youtubekids.hi_Parents(webDriver);
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
        Thread.sleep(5000);
        webDriver.findElement(By.id("next-button")).click();
        Thread.sleep(5000);
    }
    public void hi_Parents(WebDriver webDriver) throws InterruptedException {
        webDriver.findElement(By.id("onboarding-age-gate-digit-1")).sendKeys("1");
        Thread.sleep(2000);

        webDriver.findElement(By.id("onboarding-age-gate-digit-2")).sendKeys("9");
        Thread.sleep(2000);

        webDriver.findElement(By.id("onboarding-age-gate-digit-3")).sendKeys("9");
        Thread.sleep(2000);

        webDriver.findElement(By.id("onboarding-age-gate-digit-4")).sendKeys("1");
        Thread.sleep(2000);

        Thread.sleep(1000);
        webDriver.findElement(By.id("submit-button")).click();

    }}

