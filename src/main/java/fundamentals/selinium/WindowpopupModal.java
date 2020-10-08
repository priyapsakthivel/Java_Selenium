package fundamentals.selinium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;

public class WindowpopupModal {
    public static void main(String[]args){
        File file= new File("P:/Webdrivers/msedgedriver.exe");
        System.setProperty("webdriver.driver.edge",file.getAbsolutePath());
        WindowpopupModal windowpopupModal= new WindowpopupModal();
        windowpopupModal.singleWindowPopup();
    }
    public  void singleWindowPopup(){
        WebDriver driver= new EdgeDriver();
        driver.get("P:/Webdrivers/msedgedriver.exe");
        driver.manage().window().maximize();
    }
}
