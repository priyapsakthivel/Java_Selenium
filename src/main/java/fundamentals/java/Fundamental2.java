package fundamentals.java;

import java.util.Scanner;

public class Fundamental2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
       int name= scanner.nextInt();
        System.out.println(name);
        Fundamental1 fundamental1=new Fundamental1(10,12);
        fundamental1.addition(11,12,34);
        Fundamental2 fundamental2=new Fundamental2();
        Object variable=fundamental2.hello();
    }
    public String hello(){
        return ("String");
    }

}
