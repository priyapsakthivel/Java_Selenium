package fundamentals.Preparation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

/**
 * Program objective is to understand the principles of method
 */
public class MethodTraining {


    /**
     * inside a class we can only initialize and declare variables
     */

    //declaration
    int number;

    //initialization
    int value = 1;


    /*Methods can be declared anywhere inside a class*/
    //Method should always have a return type
    //return types can be only of classes/ data types
    public int helloWorld() {
        return 0;
    }

    public int helloWorld1() {
        int a = 0;
        return a;
    }


    public WebDriver helloDriver(){
        WebDriver driver1 = new EdgeDriver();

        return driver1;
    }


    /*
    * Return value should be always a instance of return type of the method
    * */
    public WebDriver helloDriver1(){
        WebDriver driver = new EdgeDriver();
        return driver;
    }

    /**
     * Main itself is a method
     */
    public static void main(String[] args) {
        MethodTraining methodTraining = new MethodTraining();

        SeliniumMethodTraining seliniumMethodTraining = new SeliniumMethodTraining();
        WebDriver driver = seliniumMethodTraining.getDriverObject();
        //Calling a method
        methodTraining.helloWorld();
        methodTraining.helloDriver();
        methodTraining.helloDriver1();
        methodTraining.helloWorld1();

        //Calling a method and storing the return value
        int a = methodTraining.helloWorld();
        int b = methodTraining.helloWorld1();
        System.out.println(a);
        System.out.println(b);
        System.out.println(driver);

    }


}
