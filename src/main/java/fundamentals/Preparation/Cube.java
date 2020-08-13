package fundamentals.Preparation;

import java.util.Scanner;

public class Cube {
    public static void main(String[] args) {
        System.out.println("please enter a number you want cube root");
        Scanner scanner= new Scanner(System.in);
        int number= scanner.nextInt();
        int cube= number*number*number;
        System.out.println("Cube root of "+number+"="+cube);
    }
}
