package amazonMethodpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;

public class Hotstar {
    public static void main(String[]args){
        File file = new File("P:\\Webdrivers\\msedgedriver.exe");
        System.setProperty("webdriver.edge.driver",file.getAbsolutePath());
        Hotstar hotstar = new Hotstar();
        WebDriver launch=hotstar.hotStarLaunch();
        hotstar.hotstarLogin(launch);
    }
    public WebDriver hotStarLaunch(){
        WebDriver driver= new EdgeDriver();
        driver.get("https://www.hotstar.com/in");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div[1]/div/div[2]/div/div[5]/div")).click();

        return driver;
    }
    public WebDriver hotstarLogin(WebDriver launch){

        return launch;
    }
}
