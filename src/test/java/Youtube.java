import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;

public class Youtube {
    @BeforeClass
    public WebDriver launch(){
        File file = new File("P:/Webdrivers/msedgedriver.exe");
        System.setProperty("webdriver.edge.driver",file.getAbsolutePath());
        WebDriver driver= new EdgeDriver();
        driver.get("https://www.youtube.com/");
        driver.manage().window().maximize();
        return driver;
    }
    @Test
    public WebDriver thumbnailAccess(WebDriver driver) throws InterruptedException {
        driver.findElement(By.id("thumbnail")).click();
        Thread.sleep(20000);
        return launch();
    }
}
