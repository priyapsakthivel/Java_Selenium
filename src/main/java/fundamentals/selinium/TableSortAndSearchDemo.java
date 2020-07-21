package fundamentals.selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.util.Scanner;

public class TableSortAndSearchDemo {
    public static void main(String[] args) {
        System.out.println("please enter show results filter number 10/25/50/100");
        System.out.println("please enter what you are searching name/position/office/age/startdate/salary/");

        Scanner scanner= new Scanner(System.in);
        int show=scanner.nextInt();
        String Search=scanner.next();

        File file= new File("P:/Webdrivers/edgedriver.exe");
        System.setProperty("webdriver.edge.driver",file.getAbsolutePath());
        TableSortAndSearchDemo.webElementOperation();

    }
    public static void webElementOperation(){
        WebDriver webDriver= new EdgeDriver();
        webDriver.get("https://www.seleniumeasy.com/test/table-sort-search-demo.html");
        webDriver.manage().window().maximize();
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor)webDriver;
        javascriptExecutor.executeScript("scrollTo(0,200)");

        WebElement showDropdown = webDriver.findElement(By.id("example_length"));
        showDropdown.click();
        showDropdown.sendKeys();
    }
}
