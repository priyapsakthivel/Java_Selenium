package fundamentals.selinium;

import java.util.Scanner;

public class Calculator_return {
    public static void main(String[]args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("please enter a integer1");
        int a= scanner.nextInt();
        System.out.println("please enter an operation");
        String operation=scanner.next();
        System.out.println("please enter a integer2");
        int b= scanner.nextInt();
        Calculator_return obj= new Calculator_return();
        if(operation.equals("+")){
            obj.addition(a,b);
        }
        else if(operation.equals("-")){
            obj.subtration(a,b);
        }
        else if(operation.equals("*")){
            obj.multiplication(a,b);
        }
        else if(operation.equals("/")){
            obj.division(a,b);
        }

    }
    public Integer addition(int a,int b){
        int add= a+b;
        System.out.println(add);
        return 0;
    }
    public Integer subtration(int a,int b){
        int sub= a-b;
        System.out.println(sub);
        return 0;
    }
    public Integer multiplication(int a,int b){
        int multi= a*b;
        System.out.println(multi);
        return 0;
    }
    public Integer division(int a,int b){
        int div= a/b;
        System.out.println(div);
        return 0;
    }
}
