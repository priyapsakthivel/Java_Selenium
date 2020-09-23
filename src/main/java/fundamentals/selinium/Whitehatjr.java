package fundamentals.selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.util.Scanner;

public class Whitehatjr {
    public static void main(String[]args) throws InterruptedException {
        File file= new File("P:/Webdrivers/msedgedriver.exe");
        System.setProperty("webdriver.edge.driver",file.getAbsolutePath());
      Whitehatjr obj= new Whitehatjr();
      WebDriver website =obj.launch();
      obj.fill(website);
    }
    public WebDriver launch(){
        WebDriver driver= new EdgeDriver();
        driver.get("https://code.whitehatjr.com/trial/register?utm_source=Google_India_Search&utm_campaign=Sok_Whitehat_Search_Brand_Exact&utm_content=87393542122&utm_term=434998326935&gclid=EAIaIQobChMI_bqYnp346wIVwtaWCh1yuQTYEAAYASAAEgL86fD_BwE");
        driver.manage().window().maximize();
        return driver;
    }
    public void fill(WebDriver website) throws InterruptedException {
        Scanner scanner= new Scanner(System.in);
        System.out.println("please enter email id");
        String email =scanner.next();
        website.findElement(By.id("email")).sendKeys(email);
        Thread.sleep(2000);
        System.out.println("please enter parentname");
        String parentname =scanner.next();
        website.findElement(By.id("parentName")).sendKeys(parentname);
        Thread.sleep(2000);
        System.out.println("please enter phoneNumber");
        String phoneNumber =scanner.next();
        website.findElement(By.id("mobile")).sendKeys(phoneNumber);
        Thread.sleep(2000);
        System.out.println("please enter studentName");
        String studentName =scanner.next();
        website.findElement(By.id("studentName")).sendKeys(studentName);
        Thread.sleep(2000);
        Select select= new Select(website.findElement(By.id("grade")));
        select.selectByValue("3");
        Thread.sleep(2000);

    }

}
