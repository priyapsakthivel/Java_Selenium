package fundamentals.Preparation;

import java.util.Scanner;

public class UpperCase {
    public static void main(String[] args) {
        UpperCase obj= new UpperCase();
        obj.caseConvert();
    }
    public String caseConvert(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("please enter any string");
        String statement=scanner.next();
        String afterConvert= statement.toUpperCase();
        System.out.println(afterConvert);
        return ("statement");
    }
}
