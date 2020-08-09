package fundamentals.selinium;

import java.util.Scanner;

public class Tables {
    public static void main(String[] args) {
        System.out.println("please enter a number you want to check if its a prime number or not");
        Scanner scanner= new Scanner(System.in);
        int  number= scanner.nextInt();

      for(int a=1;a<=10;a++){
          System.out.println(a*number);
        }
    }
}
