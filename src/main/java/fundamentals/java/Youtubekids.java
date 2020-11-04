package fundamentals.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;

public class Youtubekids {
    public static void main(String[]args){
        File file = new File("P:\\Webdrivers\\msedgedriver.exe");
        System.setProperty("webdriver.edge.driver",file.getAbsolutePath());
        Youtubekids youtubekids= new Youtubekids();
        youtubekids.launch();
    }
    public void launch(){
        WebDriver driver= new EdgeDriver();
        driver.get("https://www.youtubekids.com/");
    }
}
