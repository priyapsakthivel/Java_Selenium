package fundamentals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import java.io.File;
import java.util.Scanner;


public class Instagram {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner= new Scanner(System.in);
        System.out.println("please enter your user name");
        String userNameInput=scanner.next();
        System.out.println("please enter your password");
        String passwordInput=scanner.next();
        Instagram instagram = new Instagram();
        WebDriver credentials = instagram.browserLaunch();
        instagram.login (credentials,userNameInput,passwordInput);
        instagram.home(credentials);
        instagram.like(credentials);
        instagram.search(credentials);
    }

    public WebDriver browserLaunch(){
        File file = new File("P:/Webdrivers/msedgedriver.exe");
        System.setProperty("webdriver.edge.driver", file.getAbsolutePath());
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.instagram.com");
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
        Thread.sleep(10000);
    }
    public void home(WebDriver driver) throws InterruptedException {
        driver.findElement(By.xpath("//*[@id='react-root']/section/main/div/div/div/div/button")).click();
        Thread.sleep(2000);
        WebElement turnOfNotification=driver.findElement(By.xpath("//*[@id=\"react-root\"]/section/nav/div[2]/div/div/div[3]/div/div[3]/a"));
        turnOfNotification.click();
        Thread.sleep(2000);
    }
    public void like(WebDriver driver) throws InterruptedException {
        WebElement favourite=driver.findElement(By.xpath("/html/body/div[1]/section/nav/div[2]/div/div/div[3]/div/div[3]/a"));
        favourite.click();
        Thread.sleep(2000);
    }
    public void search(WebDriver driver) throws InterruptedException {
        WebElement searchInput=driver.findElement(By.xpath("//*[@id=\"react-root\"]/section/nav/div[2]/div/div/div[2]/input"));
        searchInput.sendKeys("#BW");
        searchInput.sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        searchInput.sendKeys(Keys.ENTER);

    }
}
