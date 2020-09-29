package fundamentals.selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.util.ArrayList;

public class Bootstrap {
    public static void main(String[]args) {
        Bootstrap bootstrap= new Bootstrap();
        WebDriver launching=bootstrap.launch();
        bootstrap.maximize(launching);

    }
    public WebDriver launch(){
        File file = new File("P:/Webdrivers/msedgedriver.exe");
        System.setProperty("webdriver.edge.driver", file.getAbsolutePath());
        WebDriver webDriver = new EdgeDriver();
        webDriver.get("https://www.seleniumeasy.com/test/bootstrap-alert-messages-demo.html");
        return webDriver;
    }
    public WebDriver maximize(WebDriver launching){
        launching.manage().window().maximize();
        launching.findElement(By.id("autoclosable-btn-success")).click();
        String  text =launching.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div[1]")).getText();
        System.out.println(text);
        return launching;
    }
}
