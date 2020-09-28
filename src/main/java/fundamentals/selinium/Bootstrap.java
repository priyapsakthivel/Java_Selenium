package fundamentals.selinium;

import java.io.File;

public class Bootstrap {
    File file= new File("P:/Webdrivers/MicrosoftWebDriver.exe");
    System.setProperty("webdriver.edge.driver",file.getAbsolutePath());

}
