package fundamentals.selinium;

import java.io.File;

public class Whitehatjr {
    public static void main(String[]args){
      Whitehatjr obj= new Whitehatjr();
      obj.launch();
    }
    public void launch(){
        File file= new File("P:/Webdrivers/msedgedriver.exe");
        System.setProperty("webdriver.edge.driver",file.getAbsolutePath());
    }
}
