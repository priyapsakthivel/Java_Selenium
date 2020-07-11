package fundamentals.selinium;

import java.io.File;

public class DriverPath {

    public static void setDriverPath(){
        File file = new File("P:/Webdrivers/edgedriver.exe");
        System.setProperty("webdriver.edge.driver", file.getAbsolutePath());
    }


}
