package fundamentals.java;

import fundamentals.selinium.DriverPath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class CalculatorOnline {
    public static void main(String[] args) {
        DriverPath.setDriverPath();
        WebDriver webDriver = new EdgeDriver();
        webDriver.get("https://www.calculator.net/");
        WebElement num1=webDriver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[2]"));
        num1.click();
        WebElement oper= webDriver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[1]/span[4]"));
        oper.click();
        num1.click();
        WebElement equals = webDriver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[5]/span[4]"));
        equals.click();
        String adding = webDriver.findElement(By.id("sciOutPut")).getText();
        System.out.println(adding);

    }

}
