import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;

public class Instagram {

        @BeforeTest
        public WebDriver browserLaunch(){
            File file = new File("P:/Webdrivers/msedgedriver.exe");
            System.setProperty("webdriver.edge.driver", file.getAbsolutePath());
            WebDriver driver = new EdgeDriver();
            driver.get("https://www.instagram.com/");
            driver.manage().window().maximize();
            driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[1]/div/label/input"));
            return driver;
        }
        @Test
        public void login(WebDriver driver, String userNameInput, String passwordInput) throws InterruptedException {

            WebElement userName = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[1]/div/label/input"));
            userName.sendKeys(userNameInput);
            WebElement password = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[2]/div/label/input"));
            password.sendKeys(passwordInput);
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]/button")).click();
            Thread.sleep(2000);
        }
        @Test
        public void home(WebDriver driver) throws InterruptedException {  //notifications
            WebElement turnOfNotification=driver.findElement(By.xpath("///*[@id=\"react-root\"]/section/nav/div[2]/div/div/div[3]/div/div[1]/div/a"));
            turnOfNotification.click();
            Thread.sleep(2000);
        }
        @Test
        public void like(WebDriver driver) throws InterruptedException {
        WebElement favourite=driver.findElement(By.xpath("/html/body/div[1]/section/nav/div[2]/div/div/div[3]/div/div[3]/a"));
        favourite.click();
        Thread.sleep(2000);
         }
         @Test
        public void search(WebDriver driver) throws InterruptedException {
        WebElement searchInput=driver.findElement(By.xpath("//*[@id=\"react-root\"]/section/nav/div[2]/div/div/div[2]/input"));
        searchInput.sendKeys("#BW");
        searchInput.sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        searchInput.sendKeys(Keys.ENTER);
        }}
