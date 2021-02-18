package amazonMethodpractice.java_warmup_learn;

import java.util.Scanner;

public class Scanner_learn {
    public static void main(String[]args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("please enter your name");
        String name= scanner.next();
        System.out.println("please enter your age");
        int age= scanner.nextInt();
        System.out.println("please enter your gender");
        String gender= scanner.next();

        Scanner_learn obj= new Scanner_learn();
        obj.personal_details(name,age);
    }
    public void personal_details(String name,int age){
        System.out.println("customer name:"+name);
        System.out.println("customer age:"+age);
    }
}
