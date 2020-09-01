package fundamentals.amazon;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class AmazonChooseSecondProduct {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner= new Scanner(System.in);
        System.out.println("please enter the product you are searching");
        String search=scanner.next();
        File file= new File("P:/Webdrivers/msedgedriver.exe");
        System.setProperty("webdriver.edge.driver",file.getAbsolutePath());

        WebDriver driver =new EdgeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        WebElement searchbox=driver.findElement(By.id("twotabsearchtextbox"));
        searchbox.sendKeys(search);
        searchbox.sendKeys(Keys.ENTER);
        Thread.sleep(4000);
        JavascriptExecutor jse= (JavascriptExecutor)driver;
        jse.executeScript("scrollTo(0,500)");
        WebElement product=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div/div[1]/div/span[3]/div[2]/div[4]/div/span/div/div/div/div/div[2]/h2/a"));
        product.click();
//        moving to other tab
        ArrayList<String> tab = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tab.get(1));




    }
}
