package fundamentals.Preparation;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        System.out.println("please enter a number you want square root");
        Scanner scanner= new Scanner(System.in);
        int number= scanner.nextInt();
        int square= number*number;
        System.out.println("Square root of "+number+"="+square);
    }
}
