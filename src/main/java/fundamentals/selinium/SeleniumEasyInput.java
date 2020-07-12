package fundamentals.selinium;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;

public class SeleniumEasyInput {
    public static void main(String [] args) throws InterruptedException {
        String input_text = "have a good day";
        File file =new File("P:/Webdrivers/edgedriver.exe");
        System.setProperty("webdriver.edge.driver",file.getAbsolutePath());
        WebDriver webDriver= new EdgeDriver();
        JavascriptExecutor jse = (JavascriptExecutor)webDriver;

        webDriver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
        webDriver.manage().window().maximize();
        webDriver.findElement(By.id("at-cv-lightbox-close")).click();
        webDriver.findElement(By.id("user-message")).sendKeys(input_text);
        webDriver.findElement(By.xpath("//*[@id=\"get-input\"]/button")).click();
        jse.executeScript("scrollTo(0,200)");
        String displayMessage =webDriver.findElement(By.id("display")).getText();
        System.out.println(displayMessage);
         Assert.assertEquals(input_text,displayMessage);
         jse.executeScript("alert(\"+displayMessage+\")");
    }
}

