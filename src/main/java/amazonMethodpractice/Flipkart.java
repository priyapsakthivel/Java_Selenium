package amazonMethodpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.util.Scanner;

public class Flipkart {
    public static void main(String[]args) throws InterruptedException {
        File file= new File("P:\\Webdrivers\\msedgedriver.exe");
        System.setProperty("webdriver.edge.driver",file.getAbsolutePath());
        Flipkart flipkart= new Flipkart();
        WebDriver login = flipkart.flipkartGrocery();
        flipkart.search(login);
    }
    public WebDriver flipkartGrocery() throws InterruptedException {
        Scanner scanner= new Scanner(System.in);
        System.out.println("please enter your email id");
        String emailId =scanner.next();
        System.out.println("please enter your password");
        String password =scanner.next();
        WebDriver driver= new EdgeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys(emailId);
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys(password);
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button")).click();
        Thread.sleep(2000);
        return driver;
    }
    public void search(WebDriver login){
        login.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input")).sendKeys();
    }

}
