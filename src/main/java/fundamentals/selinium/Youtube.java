package fundamentals.selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;

public class Youtube {
    public static void main(String[] args) {
        File file = new File("P:/Webdrivers/msedgedriver.exe");
        System.setProperty("webdriver.edge.driver",file.getAbsolutePath());
        Youtube youtube= new Youtube();
        WebDriver launch =youtube.launch();
        youtube.thumbnailAccess(launch);
    }
    public WebDriver launch(){
        WebDriver driver= new EdgeDriver();
        driver.get("https://www.youtube.com/");
        driver.manage().window().maximize();
        return launch();
    }
    public WebDriver thumbnailAccess(WebDriver launch) throws InterruptedException {
        launch.findElement(By.id("thumbnail")).click();
        Thread.sleep(20000);
        launch.quit();
        Thread.sleep(20000);
        return launch();



    }

}
