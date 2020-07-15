package fundamentals.java;

import fundamentals.selinium.DriverPath;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.ScreenshotException;

import java.io.File;
import java.util.Scanner;

public class SurpriseTest6 {
    public static void main(String[] args) {
        System.out.println("please enter a product you wanna search");
        Scanner scanner = new Scanner(System.in);
        String productName =scanner.nextLine();

        DriverPath.setDriverPath();
        WebDriver webDriver = new EdgeDriver();
        webDriver.get("https://www.flipkart.com/");
        WebElement a = webDriver.findElement(By.id(""));
        WebElement search =webDriver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input"));
        search.sendKeys(productName);
        search.sendKeys(Keys.ENTER);

    }

}
