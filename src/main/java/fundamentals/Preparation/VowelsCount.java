package fundamentals.Preparation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a name");
        String name = scanner.next();
        System.out.println("please enter a character to find its occurance");
        String finder=scanner.next();
        VowelsCount obj = new VowelsCount();
        System.out.println(obj.vowelsCount(name,finder));
    }
    public Map<String,Integer> vowelsCount(String name,String finder){
        Map<String,Integer> obj= new HashMap<String,Integer>();
        String []namesArray=name.split("");
        int count=0;
        for (String s : namesArray) {
            if (s.equals(finder)) {
                obj.put(finder, count + 1);
                count = count + 1;
            }
        }
        return(obj);
    }
}
