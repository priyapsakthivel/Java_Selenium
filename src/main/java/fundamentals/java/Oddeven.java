package fundamentals.java;

import java.util.Scanner;

public class Oddeven {
    public static void main(String[]args){
        Scanner scanner =  new Scanner(System.in);
        System.out.println("please enter any number to check if its even or odd");
        int number=scanner.nextInt();
        Oddeven oddeven= new Oddeven();
        if(number==0){
            System.out.println(" number is  neither even or odd");
        }
        else if(number%2==0){
        oddeven.even();
        }
        else{
        oddeven.odd();
        }
    }
    public void even(){
        System.out.println("its a even number");
    }
    public void odd(){
        System.out.println("its a odd number");
    }
}
