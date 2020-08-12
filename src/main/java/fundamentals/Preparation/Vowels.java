package fundamentals.Preparation;

import java.util.ArrayList;
import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        System.out.println("please enter a name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        Vowels obj = new Vowels();
       System.out.println(obj.vowelsCheck(name));

    }

    public boolean vowelsCheck(String name) {
        String[] a = name.split("");
        for (String x : a) {
            if (x.contains("a")) {
                return (true);
            } else if (x.contains("e")) {
                return (true);
            } else if (x.contains("i")) {
                return (true);
            } else if (x.contains("o")) {
                return (true);
            } else if (x.contains("u")) {
                return (true);
            }
        }
        return (false);
    }
}
