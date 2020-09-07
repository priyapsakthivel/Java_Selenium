package fundamentals.selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Swiggy {
    public static void main(String[] args) throws InterruptedException {
        File file= new File("P:/Webdrivers/msedgedriver.exe");
        System.setProperty("webdriver.edge.driver",file.getAbsolutePath());
        Swiggy obj= new Swiggy();
        WebDriver webDriver=obj.swiggyLaunch();
        JavascriptExecutor jse =(JavascriptExecutor)webDriver;
        obj.SwiggyLogin(webDriver);
        obj.premium(webDriver,jse);
        obj.moreAddress(webDriver,jse);
    }
    public WebDriver swiggyLaunch(){
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.swiggy.com/restaurants");
        driver.manage().window().maximize();
        return driver;
    }
    public void SwiggyLogin(WebDriver webDriver) throws InterruptedException {
        webDriver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/div[1]/div[1]/div/div[1]/div/a[1]")).click();
        Thread.sleep(2000);
        Scanner scanner= new Scanner(System.in);
        System.out.println("please enter your mobile number");
        String mobileNumber= scanner.next();
        webDriver.findElement(By.id("mobile")).sendKeys(mobileNumber);
        webDriver.findElement(By.xpath("//*[@id=\"overlay-sidebar-root\"]/div/div/div[2]/div/div/div/form/div[2]/a")).click();
        Thread.sleep(200);
        System.out.println("please enter your otp");
        String otp= scanner.next();
        webDriver.findElement(By.id("otp")).sendKeys(otp);
        Thread.sleep(5000);
        webDriver.findElement(By.xpath("//*[@id=\"overlay-sidebar-root\"]/div/div/div[2]/div/div/div/div[2]/form/div[2]/div[2]/a")).click();
        Thread.sleep(2000);
    }
    public WebDriver premium(WebDriver webDriver, JavascriptExecutor jse) throws InterruptedException {

        jse.executeScript("scrollTo(0,500)");
        webDriver.findElement(By.xpath("//*[@id=\"open_filter\"]/div/div/div[1]/div/div/div/div/div[1]/a[2]/div")).click();
        Thread.sleep(2000);
        webDriver.findElement(By.xpath("//*[@id=\"filter_11709\"]/div[2]/div[1]/div[1]/a")).click();
        /*ArrayList<String> tab = new ArrayList<String>(webDriver.getWindowHandles());
        webDriver.switchTo().window(tab.get(2));*/
        Thread.sleep(2000);
        webDriver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[1]/div[3]/div[2]/div/div/div[1]/span[1]")).click();
        return webDriver;
    }
    public void moreAddress(WebDriver webDriver, JavascriptExecutor jse) throws InterruptedException {
        webDriver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/header/div/div/div/span[3]")).click();
        jse.executeScript("scrollTo(0,200)");
        Thread.sleep(2000);
        webDriver.findElement(By.xpath("//*[@id=\"overlay-sidebar-root\"]/div/div/div[2]/div/div/div[3]/div/div[3]/div[3]")).click();
        webDriver.findElement(By.xpath("//*[@id=\"overlay-sidebar-root\"]/div/div/div[2]/div/div/div[3]/div/div[3]/div[2]/div[3]")).click();
    }
}
