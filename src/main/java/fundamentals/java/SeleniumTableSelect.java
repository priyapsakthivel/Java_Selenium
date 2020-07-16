package fundamentals.java;

import fundamentals.selinium.DriverPath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.sql.Driver;
import java.util.Scanner;

public class SeleniumTableSelect {
    public static void main(String[] args) {
        System.out.println("please enter row and column number");
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int column = scanner.nextInt();

        DriverPath.setDriverPath();
        WebDriver webDriver = new EdgeDriver();
        webDriver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
        WebElement table= webDriver.findElement(By.xpath("//*[@id=\"treemenu\"]/li/ul/li[3]/a"));
        table.click();
        WebElement tablepagination = webDriver.findElement(By.xpath("//*[@id=\"treemenu\"]/li/ul/li[3]/ul/li[1]/a"));
        tablepagination.click();
        int columnXpath = column+1;
        if(row<=5){
        WebElement lesstanfive =webDriver.findElement(By.xpath("//*[@id=\"myTable\"]/tr["+row+"]/td["+columnXpath+"]"));
        lesstanfive.click();
        lesstanfive.getText();
            String displayed=lesstanfive.getText();
            System.out.println(lesstanfive);
            System.out.println(displayed);
        }

    }
}
