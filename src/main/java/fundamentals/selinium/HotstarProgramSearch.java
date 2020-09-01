package fundamentals.selinium;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.util.Scanner;

public class HotstarProgramSearch {
    public static void main (String[]args)throws InterruptedException{
        System.out.println("please enter a program you would like to watch");
        Scanner scanner =new Scanner(System.in);
        String program = scanner.nextLine();

        File file = new File("P:/Webdrivers/msedgedriver.exe");
        System.setProperty("webdriver.edge.driver",file.getAbsolutePath());

        WebDriver webDriver= new EdgeDriver();
        webDriver.get("https://www.hotstar.com/in");
        webDriver.manage().window().maximize();

        Thread.sleep(200);

        WebElement webElement = webDriver.findElement(By.id("searchField"));
        webElement.sendKeys(program);
        webElement.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        webDriver.close();
        //String video ="//*[@id=\"app\"]/div[2]/div/div[1]/div[2]/div/div/div/div/div[2]/div[3]/div/div/article/a/div[1]";
        //webElement.findElement(By.xpath(video)).click();

    }
}
