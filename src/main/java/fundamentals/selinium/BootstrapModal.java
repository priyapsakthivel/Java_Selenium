package fundamentals.selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.util.Scanner;

public class BootstrapModal {
    public static void main (String[]args){
        File file= new File("P:/Webdrivers/msedgedriver.exe");
        System.setProperty("webdriver.edge.driver",file.getAbsolutePath());
        BootstrapModal bootstrapModal = new BootstrapModal();
        WebDriver website =bootstrapModal.launch();
        bootstrapModal.singleModal(website);
    }
    public WebDriver launch(){
        WebDriver driver= new EdgeDriver();
        driver.get("P:/Webdrivers/msedgedriver.exe");
        driver.manage().window().maximize();
        return driver;
    }
    public void singleModal(WebDriver website) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        website.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[1]/div/div/div[2]/a")).click();
        String singleModal =website.findElement(By.xpath("//*[@id=\"myModal0\"]/div/div/div[3]")).getText();
        Thread.sleep(2000);
        System.out.println("message displayed in screen was: "+singleModal);
        System.out.println("please choose any option '1'for close & '2' for savechanges");
        String single =scanner.next();

        if(single=="1"){
            website.findElement(By.xpath("//*[@id=\"myModal0\"]/div/div/div[4]/a[1]")).click();
        }
        else if(single=="2"){
            website.findElement(By.xpath("//*[@id=\"myModal0\"]/div/div/div[4]/a[2]")).click();
        }

    }
}
