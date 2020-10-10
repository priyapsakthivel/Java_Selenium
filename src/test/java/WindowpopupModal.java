import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;

public class WindowpopupModal {
        @BeforeClass
        public static void main(String[]args) throws InterruptedException {
            File file= new File("P:/Webdrivers/msedgedriver.exe");
            System.setProperty("webdriver.driver.edge",file.getAbsolutePath());
            fundamentals.selinium.WindowpopupModal windowpopupModal= new fundamentals.selinium.WindowpopupModal();
            windowpopupModal.singleWindowPopup();
        }
        @Test
        public  void singleWindowPopup() throws InterruptedException {
            WebDriver driver= new EdgeDriver();
            driver.get("P:/Webdrivers/msedgedriver.exe");
            driver.manage().window().maximize();
            Thread.sleep(2000);
        }
}

