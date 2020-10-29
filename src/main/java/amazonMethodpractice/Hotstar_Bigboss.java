package amazonMethodpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;

public class Hotstar_Bigboss {
    public static void main(String[]args){
        File file= new File("P:\\Webdrivers\\msedgedriver.exe");
        System.setProperty("webdriver.edge.driver",file.getAbsolutePath());
        Hotstar_Bigboss hotstar_serial = new Hotstar_Bigboss();
     WebDriver launch =hotstar_serial.hotstar_Launch();
     hotstar_serial.hotstar(launch);
    }
    public WebDriver hotstar_Launch(){

        WebDriver driver = new EdgeDriver();
        driver.get("https://www.hotstar.com/in");
        driver.manage().window().maximize();
        return driver;
    }

    public WebDriver hotstar(WebDriver launch){
        WebElement search =launch.findElement(By.id("searchField"));
        search.sendKeys("Bigboss");
        search.sendKeys(Keys.ENTER);
        return hotstar(launch);
    }
    public WebDriver choose_Thumbnail() throws InterruptedException {
        hotstar_Launch().findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/div[2]/div/div/div/div/div[2]/div[1]/div/div/article/a/div[2]")).click();

        Thread.sleep(2000);
       return choose_Thumbnail();
    }
}
