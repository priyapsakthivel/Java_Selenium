import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;

import static org.junit.Assert.assertEquals;

public class MyFirstTest {
    WebDriver webDriver;
    JavascriptExecutor jse;

    @BeforeTest
    public void initializeDriver(){
        File file = new File("P:/Webdrivers/edgedriver.exe");
        System.setProperty("webdriver.edge.driver",file.getAbsolutePath());
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.setCapability("headless","true");
        webDriver = new EdgeDriver(edgeOptions);

        jse = (JavascriptExecutor)webDriver;
    }

    @Test(groups = "Selinium Easy",priority = 1)
    public void testInputMessage() throws InterruptedException {
        webDriver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
        webDriver.manage().window().maximize();
        Thread.sleep(3000);
        webDriver.findElement(By.id("at-cv-lightbox-close")).click();
        webDriver.findElement(By.id("user-message")).sendKeys("Hello");
        webDriver.findElement(By.xpath("//*[@id=\"get-input\"]/button")).click();
        jse.executeScript("scrollTo(0,200)");
        String displayMessage =webDriver.findElement(By.id("display")).getText();
        System.out.println(displayMessage);
        assertEquals("Hello",displayMessage);
    }

    @Test(groups = "Flipkart",priority = 1)
    public void testFlipkart() {
        webDriver.get("https://flipkart.com");
        webDriver.manage().window().maximize();
        WebElement productSearchEl = webDriver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input"));
        productSearchEl.sendKeys("EOS R");
        productSearchEl.sendKeys(Keys.ENTER);
    }
}
