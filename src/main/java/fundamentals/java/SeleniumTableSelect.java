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
        System.out.println("please enter row<=13 and column<=7 number");
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int column = scanner.nextInt();

        DriverPath.setDriverPath();
        WebDriver webDriver = new EdgeDriver();
        webDriver.get("https://www.seleniumeasy.com/test/table-pagination-demo.html");
        webDriver.manage().window().maximize();
//        WebElement table= webDriver.findElement(By.xpath("//*[@id=\"treemenu\"]/li/ul/li[3]/a"));
//        table.click();
//        WebElement tablepagination = webDriver.findElement(By.xpath("//*[@id=\"treemenu\"]/li/ul/li[3]/ul/li[1]/a"));
//        tablepagination.click();
        int columnXpath = column+1;
        WebElement next = webDriver.findElement(By.xpath("//*[@id=\"myPager\"]/li[5]/a"));
        if(row<=5){
        WebElement lesstanfive =webDriver.findElement(By.xpath("//*[@id=\"myTable\"]/tr["+row+"]/td["+columnXpath+"]"));
        lesstanfive.click();

            String displayed=lesstanfive.getText();
            System.out.println(lesstanfive);
            System.out.println(displayed);
        }

        else if (row<=10){
            next.click();
            WebElement fivetoten =webDriver.findElement(By.xpath("//*[@id=\"myTable\"]/tr["+row+"]/td["+columnXpath+"]"));
           fivetoten.click();
            String displayed=fivetoten.getText();
            System.out.println(fivetoten);
            System.out.println(displayed);

        }
        else{
            next.click();
            next.click();
            WebElement ten =webDriver.findElement(By.xpath("//*[@id=\"myTable\"]/tr["+row+"]/td["+columnXpath+"]"));
            ten.click();
            String displayed=ten.getText();
            System.out.println(ten);
            System.out.println(displayed);
        }

    }
}
