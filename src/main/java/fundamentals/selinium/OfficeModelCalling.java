package fundamentals.selinium;

import java.util.ArrayList;
import java.util.List;

public class OfficeModelCalling {
    public static void main(String[] args) {
        OfficeModel amazon= new OfficeModel();
        amazon.setName("Abhishek");
        amazon.setAge(45);
        amazon.setGender('M');
        amazon.setPhonenumber(1234567890);

        OfficeModel infosys= new OfficeModel();
        infosys.setName("Babu");
        infosys.setAge(55);
        infosys.setGender('M');
        infosys.setPhonenumber(1222347890);

        OfficeModel tcs= new OfficeModel();
        tcs.setName("Lavanya");
        tcs.setAge(25);
        tcs.setGender('F');
        tcs.setPhonenumber(123345890);

        List <OfficeModel> list = new ArrayList<OfficeModel>();
        list.add(amazon);
        list.add(infosys);
        list.add(tcs);

        for(int i = 0;i<=list.size();i++){
            String name =list.get(i).getName();
            int age =list.get(i).getAge();

            System.out.println(name);
            System.out.println(age);
            System.out.println(list.get(i).getGender());
            System.out.println(list.get(i).getPhonenumber());

            if(age>40){
                System.out.println("person names above 40:"+name+" and the current age is "+age);
            }

        }

    }
}
