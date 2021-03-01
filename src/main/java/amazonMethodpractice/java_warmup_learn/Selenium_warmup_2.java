package amazonMethodpractice.java_warmup_learn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.util.Scanner;

public class Selenium_warmup_2 {
    public static void main(String[]args){
        File file= new File("P:\\Webdrivers\\msedgedriver.exe");
        System.setProperty("webdriver.edge.driver",file.getAbsolutePath());
        WebDriver driver= new EdgeDriver();
        Selenium_warmup_2 obj= new Selenium_warmup_2();
        obj.launching(driver);
        obj.popup(driver);
    }
    public void launching(WebDriver driver){
        driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
        driver.manage().window().maximize();
    }
    public void popup(WebDriver driver){
        driver.findElement(By.id("at-cv-lightbox-close")).click();
    }
    public void assigning(WebDriver driver){
        Scanner scanner= new Scanner(System.in);
        System.out.println("please enter any number1");
        int a=scanner.nextInt();
        System.out.println("please enter any number2");
        int b=scanner.nextInt();

    }
    public void twoinputfield(WebDriver driver,WebDriver assigning){
        driver.findElement(By.id("sum1")).sendKeys(a);
    }
            driver.find_element_by_id("sum1").send_keys(a)
    driver.find_element_by_id("sum2").send_keys(b)
    time.sleep(2)
            driver.find_element_by_xpath("//*[@id='gettotal']/button").click()
    twoinputfield(driver,a,b)
    def display_message(driver):
    message=driver.find_element_by_id("displayvalue").text
    print(message)
    display_message(driver)

}
