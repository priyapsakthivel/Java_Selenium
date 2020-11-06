package fundamentals.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;

public class Youtubekids {
    public static void main(String[]args) throws InterruptedException {
        File file = new File("P:\\Webdrivers\\msedgedriver.exe");
        System.setProperty("webdriver.edge.driver",file.getAbsolutePath());
        Youtubekids youtubekids= new Youtubekids();
        WebDriver webDriver =youtubekids.launch();
        youtubekids.fullscreen(webDriver);
    }
    public WebDriver launch(){
        WebDriver driver= new EdgeDriver();
        driver.get("https://www.youtubekids.com/");
        return driver;
    }
    public void fullscreen(WebDriver webDriver) throws InterruptedException {
        webDriver.manage().window().maximize();
        Thread.sleep(2000);
    }
}
