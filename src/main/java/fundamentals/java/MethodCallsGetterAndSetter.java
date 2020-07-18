package fundamentals.java;

import java.util.ArrayList;
import java.util.List;

public class MethodCallsGetterAndSetter {
    public static void main(String[] args) {
        GetterAndSetterCreation getterAndSetterCreation = new GetterAndSetterCreation();
        getterAndSetterCreation.setCar1("Audi");
        getterAndSetterCreation.setCar2("Benze");
        getterAndSetterCreation.setCar3("Duster");

//        System.out.println(getterAndSetterCreation.getCar1());
        List <GetterAndSetterCreation> list = new ArrayList<GetterAndSetterCreation>();
        list.add(getterAndSetterCreation);
        for(int a=0;a<1;a++){
            System.out.println(list.get(0).getCar1());
            System.out.println(list.get(0).getCar2());
            System.out.println(list.get(0).getCar3());
        }
    }
}
