package fundamentals.java;


import java.util.ArrayList;
import java.util.List;

public class MethodGetters {
    public static void main(String[] args) {
        UserModel userModel= new UserModel();
        userModel.setAge(22);
        userModel.setName("Dora");
        userModel.setGender("F");
        userModel.setAlive(true);

        UserModel userModel1= new UserModel();
        userModel1.setAge(25);
        userModel1.setName("john");
       userModel1.setGender("M");


        List<String> list1=new ArrayList<String>();
        list1.add("Bujji");
        list1.add("Diago");

        List<UserModel> list2=new ArrayList<UserModel>();
        list2.add(userModel);
        list2.add(userModel1);
        int size =list2.size();

        for(int a=0;a<size;a++){
            System.out.println(list2.get(a).getAge());
            System.out.println(list2.get(a).getGender());
            System.out.println(list2.get(a).getName());
            System.out.println(list2.get(a).isAlive());

        }

    }
}
