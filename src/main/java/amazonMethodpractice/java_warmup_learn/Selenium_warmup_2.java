package amazonMethodpractice.java_warmup_learn;

import java.io.File;

public class Selenium_warmup_2 {
    public static void main(String[]args){
        File file= new File("P:\\Webdrivers\\msedgedriver.exe");
        System.setProperty("webdriver.edge.driver",file.getAbsolutePath());
    }
}
