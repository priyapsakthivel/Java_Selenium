package fundamentals.selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;

public class Youtube {
    public static void main(String[] args) {
    Youtube youtube= new Youtube();
    youtube.launch();
    }
    public void launch(){
        File file = new File("P:/Webdrivers/msedgedriver.exe");
        System.setProperty("webdriver.edge.driver",file.getAbsolutePath());
        WebDriver driver= new EdgeDriver();
        driver.get("https://www.youtube.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"buttons\"]/ytd-button-renderer/a"));
    }
}
