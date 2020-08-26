package fundamentals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.util.Scanner;

public class Instagram {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner= new Scanner(System.in);
        String userNameInput=scanner.next();
        String passwordInput=scanner.next();
        Instagram instagram = new Instagram();
        WebDriver credentials = instagram.browserLaunch();
        instagram.login (credentials,userNameInput,passwordInput);
        instagram.home(credentials);
        instagram.like(credentials);
    }

    public WebDriver browserLaunch(){
        File file = new File("P:/Webdrivers/edgedriver.exe");
        System.setProperty("webdriver.edge.driver", file.getAbsolutePath());
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.instagram.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[1]/div/label/input"));
        return driver;
    }

    public void login(WebDriver driver, String userNameInput, String passwordInput) throws InterruptedException {
        WebElement userName = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[1]/div/label/input"));
        userName.sendKeys(userNameInput);
        WebElement password = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[2]/div/label/input"));
        password.sendKeys(passwordInput);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]/button")).click();
    }
    public void home(WebDriver driver) throws InterruptedException {
        WebElement turnOfNotification=driver.findElement(By.xpath("///*[@id=\"react-root\"]/section/nav/div[2]/div/div/div[3]/div/div[1]/div/a"));
        turnOfNotification.click();
        Thread.sleep(2000);
    }
    public void like(WebDriver driver){
        WebElement favourite=driver.findElement(By.xpath("//*[@id=\"react-root\"]/section/nav/div[2]/div/div/div[3]/div/div[3]/a"));
        favourite.click();
    }




}
