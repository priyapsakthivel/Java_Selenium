package fundamentals.java;


import java.util.HashMap;
import java.util.Map;

public class Fundamental6 {
    public static void main(String[] args) {
        //key and value - key is always unique and value can be duplicate
        Map<Integer,String> map  =new HashMap<Integer,String>();

        map.put(1,"man");
        map.put(1,"women");
        map.put(3,"mohan");

        String a = map.get(1);

        System.out.println(a);

    }
}
