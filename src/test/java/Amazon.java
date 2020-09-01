import amazonMethodpractice.AmazonLogin;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.util.Scanner;

public class Amazon {
    @BeforeTest
    public WebDriver webDriver(){
        File file= new File("P:/Webdrivers/msedgedriver.exe");
        System.setProperty("webdriver.edge.driver",file.getAbsolutePath());
        WebDriver driver= new EdgeDriver();
        driver.get("https://www.amazon.in/");
        return driver;
    }
    @Test
    public void webDriverAppearance(WebDriver driver) throws InterruptedException {
        driver.manage().window().maximize();
        Thread.sleep(200);
        driver.findElement(By.id("//*[@id=\"nav-link-accountList\"]")).click();
    }
    @Test
    public void signin(WebDriver driver){
        driver.findElement(By.xpath("//*[@id=\"nav-flyout-ya-signin\"]/a"));
        driver.findElement(By.id("ap_email")).sendKeys("****@gmail.com");
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.id("ap_password")).sendKeys("********");
        driver.findElement(By.id("continue")).click();
    }
    @Test
    public void menuAccess(WebDriver driver) throws InterruptedException {
        driver.findElement(By.id("nav-hamburger-menu")).click();
        driver.findElement(By.id("hmenu-customer-profile-link")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[2]/div/div[2]/div[2]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("auth-cnep-edit-name-button")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("ap_customer_name")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("cnep_1C_submit_button")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("auth-success-message-box")).getText();
        String a="selected";
        assert(a.equals("") );
    }
    @Test
    public void passwordButton(WebDriver driver) throws InterruptedException {
        System.out.println("please enter your username and password");
        Scanner scanner= new Scanner(System.in);
        String username= scanner.nextLine();
        String password= scanner.nextLine();
        driver.findElement(By.id("ap_email")).sendKeys(username);
        driver.findElement(By.id("continue")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("ap_password")).sendKeys(password);
        Thread.sleep(200);
        driver.findElement(By.id("signInSubmit")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("nav-hamburger-menu")).click();
        Thread.sleep(200);
        driver.findElement(By.id("hmenu-customer-profile-link")).click();
        driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[2]/div/div[3]/div[1]/a")).click();
        driver.findElement(By.id("ya-myab-address-add-link")).click();
    }
    @Test
    public void loginButton(WebDriver driver) throws InterruptedException {
        driver.findElement(By.id("signInSubmit")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("nav-hamburger-menu")).click();
        driver.findElement(By.id("hmenu-customer-profile-link")).click();
        driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[2]/div/div[2]/div[1]/a")).click();
        Select orderFilter = new Select(driver.findElement(By.id("//*[@id=\"a-page\"]/div[2]/div/div[2]/div[1]/a")));
        orderFilter.selectByValue("months-6");
    }
}
