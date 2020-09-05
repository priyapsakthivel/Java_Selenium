package fundamentals.selinium;

import java.io.File;

public class Swiggy {
    public static void main(String[] args) {
        File file= new File("https://www.swiggy.com/restaurants");
        System.setProperty("webdriver.edge.driver",file.getAbsolutePath());
    }
}
