package amazonMethodpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;

public class Flipkart_withoutlogin {

    public static void main(String[] args) throws InterruptedException {

    File file = new File("P:\\Webdrivers\\msedgedriver.exe");
    System.setProperty("webdriver.edge.driver",file.getAbsolutePath());
    Flipkart_withoutlogin withoutlogin = new Flipkart_withoutlogin();
    withoutlogin.skiplogin();
}

public void skiplogin() throws InterruptedException {
    WebDriver driver= new EdgeDriver();
    driver.get("https://www.flipkart.com/");
    driver.manage().window().maximize();
    Thread.sleep(2000);
    driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
    Thread.sleep(200);
    driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/span[1]")).click();
}
}