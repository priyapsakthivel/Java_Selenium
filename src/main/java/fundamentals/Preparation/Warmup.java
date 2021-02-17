package fundamentals.Preparation;

import java.util.Scanner;

public class Warmup {
    public static void main(String[]args){
        Warmup obj= new Warmup();
        obj.evenodd();
    }
    public void evenodd(){
        System.out.println("please enter a number");
        Scanner scanner = new Scanner(System.in);
        int a= scanner.nextInt();
        if (a%2==1){
            System.out.println("its even");
        }
        else{
            System.out.println("its odd");
        }
    }
}
