package fundamentals.selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;

public class Youtube {
    public static void main(String[] args) throws InterruptedException {
        File file = new File("P:/Webdrivers/msedgedriver.exe");
        System.setProperty("webdriver.edge.driver",file.getAbsolutePath());
        Youtube youtube= new Youtube();
        WebDriver driver =youtube.launch();
        youtube.thumbnailAccess(driver);
    }
    public WebDriver launch(){
        WebDriver driver= new EdgeDriver();
        driver.get("https://www.youtube.com/");
        driver.manage().window().maximize();
        return driver;
    }
    public WebDriver thumbnailAccess(WebDriver driver) throws InterruptedException {
        driver.findElement(By.id("thumbnail")).click();
        Thread.sleep(20000);
        return launch();
    }
}
