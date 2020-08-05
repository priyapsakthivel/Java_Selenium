package fundamentals.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.util.Scanner;

public class AmazonAddress {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("please enter your username and password");
        Scanner scanner= new Scanner(System.in);
        String username= scanner.nextLine();
        String password= scanner.nextLine();

        File file= new File("P:/Webdrivers/edgedriver.exe");
        System.setProperty("webdriver.edge.driver",file.getAbsolutePath());

        WebDriver webDriver= new EdgeDriver();
        webDriver.get("https://www.amazon.in/");
        WebElement signin=webDriver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]"));
        signin.click();
        webDriver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement login= webDriver.findElement(By.id("ap_email"));
        login.sendKeys(username);
        WebElement continueButton =webDriver.findElement(By.id("continue"));
        continueButton.click();
        Thread.sleep(2000);

        WebElement passwordButton = webDriver.findElement(By.id("ap_password"));
        passwordButton.sendKeys(password);
        Thread.sleep(200);
        WebElement loginButton=webDriver.findElement(By.id("signInSubmit"));
        loginButton.click();
        Thread.sleep(2000);

        WebElement menuButton=webDriver.findElement(By.id("nav-hamburger-menu"));
        menuButton.click();
        WebElement accountIcon=webDriver.findElement(By.id("hmenu-customer-profile-link"));
        accountIcon.click();
        WebElement address= webDriver.findElement(By.xpath("//*[@id=\"a-page\"]/div[2]/div/div[3]/div[1]/a"));
        address.click();
        WebElement addAddress=webDriver.findElement(By.id("ya-myab-address-add-link"));
        addAddress.click();


    }
}
