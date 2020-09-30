import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;

public class Bootstrap {
    @BeforeClass
    public WebDriver launch(){
        File file = new File("P:/Webdrivers/msedgedriver.exe");
        System.setProperty("webdriver.edge.driver", file.getAbsolutePath());
        WebDriver webDriver = new EdgeDriver();
        webDriver.get("https://www.seleniumeasy.com/test/bootstrap-alert-messages-demo.html");
        return webDriver;
    }
    @Test
    public WebDriver maximize(WebDriver launching) throws InterruptedException {
        launching.manage().window().maximize();
        launching.findElement(By.id("autoclosable-btn-success")).click();
        String  text =launching.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div[1]")).getText();
        Thread.sleep(2000);
        System.out.println(text);
        return launching;
    }
}
