package fundamentals.selinium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;

public class Whitehatjr {
    public static void main(String[]args){
        File file= new File("P:/Webdrivers/msedgedriver.exe");
        System.setProperty("webdriver.edge.driver",file.getAbsolutePath());
      Whitehatjr obj= new Whitehatjr();
      obj.launch();
    }
    public void launch(){
        WebDriver driver= new EdgeDriver();
        driver.get("https://code.whitehatjr.com/trial/register?utm_source=Google_India_Search&utm_campaign=Sok_Whitehat_Search_Brand_Exact&utm_content=87393542122&utm_term=434998326935&gclid=EAIaIQobChMI_bqYnp346wIVwtaWCh1yuQTYEAAYASAAEgL86fD_BwE");
    }
}
