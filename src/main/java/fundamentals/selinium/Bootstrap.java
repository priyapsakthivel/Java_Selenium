package fundamentals.selinium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;

public class Bootstrap {
    File file=new File("P:/Webdrivers/msedgedriver.exe");
    System.setProperty("webdriver.edge.driver",file.getAbsolutePath());
    WebDriver webDriver= new EdgeDriver();
    webDriver.get("https://www.seleniumeasy.com/test/bootstrap-alert-messages-demo.html");


}
