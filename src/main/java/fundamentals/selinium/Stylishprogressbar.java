package fundamentals.selinium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;

public class Stylishprogressbar {
    public static void main(String[]args){
        File file = new File("P:/Webdrivers/msedgedriver.exe");
        System.setProperty("webdriver.edge.driver",file.getAbsolutePath());
        Stylishprogressbar stylishprogressbar = new Stylishprogressbar();
        stylishprogressbar.launch();
    }
    public void launch(){
        WebDriver driver= new EdgeDriver();
        driver.get("https://www.seleniumeasy.com/test/bootstrap-download-progress-demo.html");
        driver.manage().window().maximize();
        JavascriptExecutor javascriptExecutor= (JavascriptExecutor)driver;
        javascriptExecutor.executeScript("scrollTo(0,200)");

    }
}
