package fundamentals.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.util.Scanner;

public class Amazonlogin {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String emailId=scanner.nextLine();
        String password= scanner.nextLine();

        File file = new File("P:/Webdrivers/msedgedriver.exe");
        System.setProperty("webdriver.edge.driver",file.getAbsolutePath());

        WebDriver webDriver = new EdgeDriver();
        webDriver.get("https://www.amazon.in/");
        webDriver.manage().window().maximize();
        WebElement login = webDriver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]"));
        login.click();
        WebElement email=webDriver.findElement(By.id("ap_email"));
        email.sendKeys(emailId);
        webDriver.findElement(By.id("continue")).click();

        WebElement passkey=webDriver.findElement(By.id("ap_password"));
        passkey.sendKeys(password);
        webDriver.findElement(By.id("signInSubmit")).click();
    }
}
