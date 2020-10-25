package amazonMethodpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;

public class Hotstar {
    public static void main(String[]args) throws InterruptedException {
        Hotstar hotstar = new Hotstar();
        WebDriver launch=hotstar.hotStarLaunch();
        WebDriver kidsChoise=hotstar.kids(launch);
        hotstar.kidsSeries(launch);
    }
    public WebDriver hotStarLaunch(){
        File file = new File("P:\\Webdrivers\\msedgedriver.exe");
        System.setProperty("webdriver.edge.driver",file.getAbsolutePath());
        WebDriver driver= new EdgeDriver();
        driver.get("https://www.hotstar.com/in");
        driver.manage().window().maximize();
        return driver;
    }
    public WebDriver kids(WebDriver launch) throws InterruptedException {
        launch.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/div[1]/div/div[2]/div/div[3]/ul/li[7]/div")).click();
        Thread.sleep(200);
        JavascriptExecutor javascriptExecutor= (JavascriptExecutor)hotStarLaunch();
        javascriptExecutor.executeScript("scrollTo(0,500)");
        return launch;
    }
    public WebDriver kidsSeries(WebDriver launch) throws InterruptedException {
        launch.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div[2]/div[2]/div/div/div/div[3]/div/div/div/div[2]/div/div/div/div[2]/div/div/div/article/a/div[1]/div")).click();
        JavascriptExecutor jse=(JavascriptExecutor)kidsSeries(launch);
        jse.executeScript("scrollTo(0,500)");
        Thread.sleep(2000);
        return kidsSeries(launch);
    }
}
