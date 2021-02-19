package amazonMethodpractice.java_warmup_learn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;

public class Selenium_warmup_1 {
    public static void main(String[]args){
      File file= new File("P:\\Webdrivers\\msedgedriver.exe");
      System.setProperty("webdriver.edge.driver",file.getAbsolutePath());
      WebDriver driver= new EdgeDriver();
      driver.get("");
    }
}
