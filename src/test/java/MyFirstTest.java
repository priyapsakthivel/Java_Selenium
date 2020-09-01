import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class MyFirstTest {
    WebDriver webDriver;
    JavascriptExecutor jse;

    @BeforeTest
    public void initializeDriver(){
        File file = new File("P:/Webdrivers/msedgedriver.exe");
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
    @Test
   public void searchbox() throws InterruptedException {
        WebDriver driver= new EdgeDriver();
       WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
       searchbox.sendKeys("samsunglevelu");
       searchbox.sendKeys(Keys.ENTER);
       Thread.sleep(2000);
       WebElement productChoice = driver.findElement(By.xpath("//*[@id=\"a-autoid-0-announce\"]/span[2]"));
       productChoice.click();
       Thread.sleep(2000);

       Select list = new Select(driver.findElement(By.id("s-result-sort-select")));
       list.selectByValue("price-asc-rank");
   }
    @Test
   public void secondProductPrice() throws InterruptedException {
        WebDriver driver= new EdgeDriver();
    WebElement searchBox=driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("table");
        searchBox.sendKeys(Keys.ENTER);
    JavascriptExecutor jse= (JavascriptExecutor)driver;
        jse.executeScript("scrollTo(0,200)");
        Thread.sleep(2000);
    WebElement secondProduct=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div/div[1]/div/span[3]/div[2]/div[4]/div/span/div/div/div/div/div[2]/h2/a"));
        secondProduct.click();
    ArrayList<String> tab=new ArrayList <String> (driver.getWindowHandles());
        driver.switchTo().window(tab.get(1));
        Thread.sleep(2000);

    WebElement price=driver.findElement(By.id("priceblock_saleprice"));
    String netprice=price.getText();
        Thread.sleep(2000);

        System.out.println("price of table ="+netprice);
        Thread.sleep(3000);
        driver.quit();
    }
    @Test
    public void twotabsearchtextbox() throws InterruptedException {
        WebElement webElement = webDriver.findElement(By.id("twotabsearchtextbox"));
        webElement.sendKeys("table");
        webElement.sendKeys(Keys.ENTER);

        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) webDriver;
        javascriptExecutor.executeScript("scrollTo(0,400)");

        WebElement productChoice = webDriver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div/div[1]/div/span[3]/div[2]/div[3]/div/span/div/div/div/div/span/a"));
        productChoice.click();
        Thread.sleep(2000);

        ArrayList<String> tab = new ArrayList<String>(webDriver.getWindowHandles());
        webDriver.switchTo().window(tab.get(1));
        Thread.sleep(2000);
        javascriptExecutor.executeScript("scrollTo(0,200)");
        WebElement save = webDriver.findElement(By.id("sfl-button"));
        save.click();
    }

}
