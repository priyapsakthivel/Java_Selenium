package fundamentals.selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;

public class TableFilterDemo {
    public static void main(String[] args) throws InterruptedException {
        File file= new File("P:/Webdrivers/edgedriver.exe");
        System.setProperty("webdriver.edge.driver",file.getAbsolutePath());

        WebDriver driver = new EdgeDriver();
        driver.get("https://www.seleniumeasy.com/test/table-records-filter-demo.html");
        driver.manage().window().maximize();
        JavascriptExecutor javascriptExecutor= (JavascriptExecutor)driver;
        javascriptExecutor.executeScript("scrollTo(0,200)");

        for(int i=1;i<=4;i++) {
            WebElement colour=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/section/div/div/div[2]/div[1]/div/button["+i+"]"));
        colour.click();
        String action=colour.getText();
            Thread.sleep(10000);
            if(i==4){
                System.out.println(action +" are completed");
            }
            else{
                System.out.println(action +" is completed");
            }
        }
        driver.quit();
    }
}
