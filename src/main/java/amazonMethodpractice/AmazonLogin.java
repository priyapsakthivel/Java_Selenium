package amazonMethodpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;

public class AmazonLogin {
    public static void main(String[] args) throws InterruptedException {
        AmazonLogin amazonLogin= new AmazonLogin();
        WebDriver driver=amazonLogin.webDriver();
        amazonLogin.webDriverAppearance(driver);
        amazonLogin.signin(driver);
    }
    public WebDriver webDriver(){
        File file= new File("P:/Webdrivers/msedgedriver.exe");
        System.setProperty("webdriver.edge.driver",file.getAbsolutePath());
        WebDriver driver= new EdgeDriver();
        driver.get("https://www.amazon.in/");
        return driver;
    }
    public void webDriverAppearance(WebDriver driver) throws InterruptedException {
        driver.manage().window().maximize();
        Thread.sleep(200);
        driver.findElement(By.id("id=\"nav-link-accountList\"")).click();
    }
    public void signin(WebDriver driver){
        driver.findElement(By.xpath("//*[@id=\"nav-flyout-ya-signin\"]/a"));
        driver.findElement(By.id("ap_email")).sendKeys("****@gmail.com");
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.id("ap_password")).sendKeys("********");
        driver.findElement(By.id("continue")).click();
    }
    public void testWorld(){
        System.out.println("println");
        System.out.println("println");
        System.out.println("println");
        System.out.println("println");
        System.out.println("println");
        System.out.println("println");
        System.out.println("println");
        System.out.println("println");
        System.out.println("println");
        System.out.println("println");
        System.out.println("println");

    }
}
