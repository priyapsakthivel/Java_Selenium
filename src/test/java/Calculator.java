import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Scanner;

public class Calculator {

    @BeforeTest
    public void scanner() {
        Scanner scanner= new Scanner(System.in);
        System.out.println("please enter number 1");
        int a=scanner.nextInt();
        System.out.println("please enter any one of the following operations:  add/subtract/multiply/divide/remainder");
        String operation= scanner.next();
        System.out.println("please enter number 2");
        int b= scanner.nextInt();
        fundamentals.Preparation.Calculator obj= new fundamentals.Preparation.Calculator();
        if(operation.equals("add")){
            obj.add(a,b);}
        else if(operation.equals("subtract")){
            obj.subtract(a,b);}
        else if(operation.equals("multiply")){
            obj.multiply(a,b);}
        else if(operation.equals("divide")){
            obj.divide(a,b);}
        else if(operation.equals("remainder")){
            obj.reminder(a,b);}

    }
    @Test
    public int add(int a,int b){
        int sum=a+b;
        System.out.println(sum);
        return (1);
    }
    @Test
    public int subtract(int a,int b){
        int sub=a-b;
        System.out.println(sub);
        return (1);
    }
    @Test
    public int multiply(int a,int b){
        int multi=a*b;
        System.out.println(multi);
        return (1);
    }
    @Test
    public int divide(int a,int b){
        int div=a/b;
        System.out.println(div);
        return (1);
    }
    @Test
    public int reminder(int a,int b){
        int remain=a%b;
        System.out.println(remain);
        return (1);
    }
}

}
