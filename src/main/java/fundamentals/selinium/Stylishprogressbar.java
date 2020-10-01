package fundamentals.selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;

public class Stylishprogressbar {
    public static void main(String[]args) throws InterruptedException {
        File file = new File("P:/Webdrivers/msedgedriver.exe");
        System.setProperty("webdriver.edge.driver",file.getAbsolutePath());
        Stylishprogressbar stylishprogressbar = new Stylishprogressbar();
        stylishprogressbar.launch();
    }
    public void launch() throws InterruptedException {
        WebDriver driver= new EdgeDriver();
        driver.get("https://www.seleniumeasy.com/test/bootstrap-download-progress-demo.html");
        driver.manage().window().maximize();
        JavascriptExecutor javascriptExecutor= (JavascriptExecutor)driver;
        javascriptExecutor.executeScript("scrollTo(0,200)");
        driver.findElement(By.id("cricle-btn")).click();
        Thread.sleep(2000);
        String download1 =driver.findElement(By.id("circle")).getText();
        Thread.sleep(2000);
        String download2 =driver.findElement(By.id("circle")).getText();
        Thread.sleep(2000);
        String download3 =driver.findElement(By.id("circle")).getText();
        System.out.println("download1 percentage:"+download1);
        System.out.println("download2 percentage:"+download2);
        System.out.println("download3 percentage:"+download3);
    }
}
