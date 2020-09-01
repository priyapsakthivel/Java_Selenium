package fundamentals.selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.util.Scanner;

public class SeleniumTwoInputFields {

    public static void main(String[]args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter 2 numbres u wanna add");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        File file= new File("P:/Webdrivers/msedgedriver.exe");
        System.setProperty("webdriver.edge.driver",file.getAbsolutePath());

        WebDriver webDriver= new EdgeDriver();
        webDriver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");

        String x = String.valueOf(a);
        String y = String.valueOf(b);
        String expected = String.valueOf(a+b);
        Thread.sleep(8000);
        webDriver.findElement(By.id("at-cv-lightbox-close")).click();
        JavascriptExecutor jse = (JavascriptExecutor)webDriver;
        jse.executeScript("scrollTo(0,800)");
        webDriver.findElement(By.id("sum1")).sendKeys(x);
        webDriver.findElement(By.id("sum2")).sendKeys(y);
        webDriver.findElement(By.id("/html/body/div[2]/div/div[2]/div[2]/div[2]/form/button")).click();
        String actual =webDriver.findElement(By.id("displayvalue")).getText();

        if (expected.equals(actual)) {
            System.out.println("both are equal");
        }
        else{
            System.out.println("both are not equal");
        }


    }
}
