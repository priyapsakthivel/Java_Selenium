package fundamentals.Preparation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;

public class Testing {
    public static void main(String[] args) {
        File file = new File("P:/Webdrivers/msedgedriver.exe");
        System.setProperty("webdriver.edge.driver",file.getAbsolutePath());
        Testing test = new Testing();
        WebDriver driver=test.openBrowser();
        test.browserApperance(driver);
        test.singleInput(driver);
        String displayEl=test.displayMessage(driver);
        System.out.println(displayEl);
    }
    public WebDriver openBrowser(){
        WebDriver driver= new EdgeDriver();
        driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
        return driver;
    }
    public void browserApperance(WebDriver driver){
        driver.manage().window().maximize();
    }
    public void singleInput(WebDriver driver){
        WebElement input= driver.findElement(By.id("user-message"));
        input.sendKeys("SeleniumJava");
        WebElement clickEl=driver.findElement(By.xpath("//*[@id=\"get-input\"]/button"));
        clickEl.click();
    }
    public String displayMessage(WebDriver driver){
        WebElement displayEl=driver.findElement(By.id("display"));
        String display=displayEl.getText();
        return display;
    }
}
