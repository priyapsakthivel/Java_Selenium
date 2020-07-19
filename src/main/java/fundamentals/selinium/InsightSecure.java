package fundamentals.selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class InsightSecure {
    public static void main(String[] args) {
        WebDriver webDriver= new EdgeDriver();
        webDriver.get("https://www.insightsonindia.com/insights-ias-new-secure-initiative-for-upsc-civil-services-exam-2020/");
        webDriver.findElement(By.xpath("//*[@id=\"mega-menu-item-115004\"]/a")).click();

    }
}
