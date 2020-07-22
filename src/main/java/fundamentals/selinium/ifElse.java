package fundamentals.selinium;

import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        System.out.println("please use any of the following numbers 10,25,50,100");
        Scanner scanner= new Scanner(System.in);
        int show=scanner.nextInt();
        if(show==10){
            System.out.println("you have entered 10");}
        else if(show==25){
            System.out.println("you have entered 25");}
        else if(show==50){
            System.out.println("you have entered 50");}
        else if(show==100){
            System.out.println("you have entered 100");}
        else{
            System.out.println("you havent provided the number in the given list");
        }
    }
}
