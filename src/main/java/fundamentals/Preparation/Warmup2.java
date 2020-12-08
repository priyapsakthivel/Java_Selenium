package fundamentals.Preparation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;

public class Warmup2 {
    public static void main(String[]args) throws InterruptedException {
        Warmup2 warmup2=new Warmup2();
        warmup2.launch();

    }
    public void launch() throws InterruptedException {
        File file= new File("P:\\Webdrivers\\msedgedriver.exe");
        System.setProperty("webdriver.edge.driver",file.getAbsolutePath());
        WebDriver driver= new EdgeDriver();
        driver.get("https://gaana.com/playlist/tanmay5709-gannacom");
        driver.findElement(By.id("p-list-play_all")).click();
        Thread.sleep(2000);

    }
}
