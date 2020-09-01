package fundamentals.selinium;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;

import java.util.Scanner;

public class TableSortAndSearchDemo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("please enter show results filter number 10/25/50/100");
        System.out.println("please enter what you are searching name/position/office/age/startdate/salary/");

//        Scanner scanner= new Scanner(System.in);
//        int show=scanner.nextInt();
//        String search=scanner.next();

        File file= new File("P:/Webdrivers/msedgedriver.exe");
        System.setProperty("webdriver.edge.driver",file.getAbsolutePath());

        WebDriver webDriver= new EdgeDriver();
        webDriver.get("https://www.seleniumeasy.com/test/table-sort-search-demo.html");
        webDriver.manage().window().maximize();
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor)webDriver;
        javascriptExecutor.executeScript("scrollTo(0,200)");
        Thread.sleep(2000);

        WebElement showDropdown = webDriver.findElement(By.id("example_length"));
        showDropdown.click();
                showDropdown.sendKeys("10");
                showDropdown.sendKeys(Keys.ENTER);
        WebElement searchEnter = webDriver.findElement(By.id("example_filter"));
        searchEnter.sendKeys("name");
        }


    }

