package fundamentals.Preparation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.util.Scanner;

public class SeleniumBasics {
    public static void main(String[] args) {

        SeleniumBasics obj = new SeleniumBasics();
        WebDriver webBrowser= obj.browser();
        obj.browserAppearance(webBrowser);
        obj.loginDetails(webBrowser);
    }
    public WebDriver browser(){
        File file = new File("P:/Webdrivers/msedgedriver.exe");
        System.setProperty("webdriver.edge.driver",file.getAbsolutePath());
        WebDriver driver= new EdgeDriver();
        driver.get("https://www.flipkart.com/");
        return driver;
    }
    public WebDriver browserAppearance(WebDriver driver){
       driver.manage().window().maximize();
        JavascriptExecutor jse= (JavascriptExecutor)driver;
        jse.executeScript("scrollTo(0,200)");
        return driver;
    }
    public WebDriver loginDetails(WebDriver driver){
        WebElement userName=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input"));
        userName.sendKeys("userName");
        WebElement password=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input"));
        password.sendKeys("password");
        WebElement loginButton=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button"));
        loginButton.click();
        return driver;
    }
}
