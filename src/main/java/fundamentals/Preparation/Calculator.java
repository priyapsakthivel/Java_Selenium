package fundamentals.Preparation;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("please enter number 1");
        int a=scanner.nextInt();
        System.out.println("please enter any one of the following operations:  add/subtract/multiply/divide/remainder");
        String operation= scanner.next();
        System.out.println("please enter number 2");
        int b= scanner.nextInt();
        Calculator obj= new Calculator();
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
    public int add(int a,int b){
        int sum=a+b;
            System.out.println(sum);
            return (1);
    }
    public int subtract(int a,int b){
        int sub=a-b;
        System.out.println(sub);
        return (1);
    }
    public int multiply(int a,int b){
        int multi=a*b;
        System.out.println(multi);
        return (1);
    }
    public int divide(int a,int b){
        int div=a/b;
        System.out.println(div);
        return (1);
    }
    public int reminder(int a,int b){
        int remain=a%b;
        System.out.println(remain);
        return (1);
    }
}

