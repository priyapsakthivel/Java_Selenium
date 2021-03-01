package amazonMethodpractice.java_warmup_learn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.util.Scanner;

public class Selenium_warmup_2 {
    public static void main(String[]args){
        File file= new File("P:\\Webdrivers\\msedgedriver.exe");
        System.setProperty("webdriver.edge.driver",file.getAbsolutePath());
        WebDriver driver= new EdgeDriver();
        Selenium_warmup_2 obj= new Selenium_warmup_2();
        obj.launching(driver);
        obj.popup(driver);
        obj.assigning(driver);
        obj.twoinputfield(driver);
    }
    public void launching(WebDriver driver){
        driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
        driver.manage().window().maximize();
    }
    public void popup(WebDriver driver){
        driver.findElement(By.id("at-cv-lightbox-close")).click();
    }
    public void assigning(WebDriver driver){
        Scanner scanner= new Scanner(System.in);
        System.out.println("please enter any number1");
        int a=scanner.nextInt();
        System.out.println("please enter any number2");
        int b=scanner.nextInt();
    }
    public void twoinputfield(WebDriver driver) throws InterruptedException {
        driver.findElement(By.id("sum1")).sendKeys();
        driver.findElement(By.id("sum2")).sendKeys();
        Thread.sleep(2);
        driver.findElement(By.xpath("//*[@id='gettotal']/button")).click();
    }
    public void display_message(WebDriver driver){
        driver.findElement(By.id("displayvalue");
        System.out.println(message);
    }
}
