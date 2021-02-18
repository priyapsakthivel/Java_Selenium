package amazonMethodpractice.java_warmup_learn;

import java.util.Scanner;

public class Scanner_learn {
    public static void main(String[]args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("please enter your name");
        String name= scanner.next();

        Scanner_learn obj= new Scanner_learn();
        obj.personal_details(name);
    }
    public void personal_details(String name){
        System.out.println(name);
    }
}
