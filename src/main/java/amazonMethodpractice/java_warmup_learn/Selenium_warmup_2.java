package amazonMethodpractice.java_warmup_learn;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.util.Scanner;

public class Selenium_warmup_2 {
    public static void main(String[]args) throws InterruptedException {
        File file= new File("P:\\Webdrivers\\msedgedriver.exe");
        System.setProperty("webdriver.edge.driver",file.getAbsolutePath());
        WebDriver driver= new EdgeDriver();
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        Selenium_warmup_2 obj= new Selenium_warmup_2();
        obj.launching(driver);
        obj.closeepopup(driver);
    }
    public void launching(WebDriver driver) throws InterruptedException {
        driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        JavascriptExecutor jse =(JavascriptExecutor)driver;
        jse.executeScript("scrollTo(0,300)");
    }
    public void closeepopup(WebDriver driver) throws InterruptedException {
        driver.findElement(By.id("at-cv-lightbox-close")).click();
        Thread.sleep(2000);
    }
    public void twoinputfield(WebDriver driver,int a, int b) throws InterruptedException {
        driver.findElement(By.id("sum1")).sendKeys("a");
        driver.findElement(By.id("sum2")).sendKeys("b");
        Thread.sleep(2000);
        driver.findElement(By.xpath("<button type=\"button\" onclick=\"return total()\" class=\"btn btn-default\">Get Total</button>")).click();
        String total=driver.findElement(By.id("displayvalue")).getText();
        System.out.println(total);
    }
}
