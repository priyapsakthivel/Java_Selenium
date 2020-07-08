package fundamentals.selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


public class SeleniumEasy {



    public static void main(String[] args) throws InterruptedException {

        DriverPath.setDriverPath();

        WebDriver webDriver = new EdgeDriver();
        webDriver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");


        WebElement add_object2=webDriver.findElement(By.id("user-message"));
        add_object2.click();
        add_object2.submit();
        webDriver.findElement(By.xpath("//*[@id=\"get-input\"]/button")).click();

        String displayText = webDriver.findElement(By.id("display")).getText();

        System.out.println(displayText);


    }
}
