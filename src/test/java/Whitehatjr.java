import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import java.util.Scanner;

public class Whitehatjr {
    @Test
    public WebDriver launch(){
        WebDriver driver= new EdgeDriver();
        driver.get("https://code.whitehatjr.com/trial/register?utm_source=Google_India_Search&utm_campaign=Sok_Whitehat_Search_Brand_Exact&utm_content=87393542122&utm_term=434998326935&gclid=EAIaIQobChMI_bqYnp346wIVwtaWCh1yuQTYEAAYASAAEgL86fD_BwE");
        driver.manage().window().maximize();
//        driver.manage().window().maximize();
        return driver;
    }
    @Test
    public void fill(WebDriver website) throws InterruptedException {
        Scanner scanner= new Scanner(System.in);
        System.out.println("please enter email id");
        String email =scanner.next();
        website.findElement(By.id("email")).sendKeys(email);
        Thread.sleep(200);
        System.out.println("please enter parentname");
        String parentname =scanner.next();
        website.findElement(By.id("parentName")).sendKeys(parentname);
        Thread.sleep(200);
        System.out.println("please enter phoneNumber");
        String phoneNumber =scanner.next();
        website.findElement(By.id("mobile")).sendKeys(phoneNumber);
        Thread.sleep(200);
        System.out.println("please enter studentName");
        String studentName =scanner.next();
        website.findElement(By.id("studentName")).sendKeys(studentName);
        Thread.sleep(2000);
    }
    }


