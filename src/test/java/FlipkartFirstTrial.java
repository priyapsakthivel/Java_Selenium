import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;

import static org.junit.Assert.assertEquals;

public class FlipkartFirstTrial {
    @BeforeTest
    public WebDriver browser(){
        File file = new File("P:/Webdrivers/edgedriver.exe");
        System.setProperty("webdriver.edge.driver",file.getAbsolutePath());
        WebDriver driver= new EdgeDriver();
        driver.get("https://www.flipkart.com/");
        return driver;
    }
    @Test(priority = 1)
    public void browserAppearance(WebDriver driver){
        driver.manage().window().maximize();
        JavascriptExecutor jse= (JavascriptExecutor)driver;
        jse.executeScript("scrollTo(0,200)");
        assert true;
        assertEquals("200",jse);
    }
    @Test
    public void loginDetails(WebDriver driver){
        WebElement userName=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input"));
        userName.sendKeys("userName");
        WebElement password=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input"));
        password.sendKeys("password");
        WebElement loginButton=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button"));
        loginButton.click();
        assert true;
    }

}
