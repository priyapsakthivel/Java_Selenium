package fundamentals.java;

import java.util.ArrayList;
import java.util.List;

/**
* Objective : Create a model class with name , age and gender
 *            all 3 variables should be private
 *            all 3 variables to have getters and setters
 *            Add 3 userModel object to a Employemodel List
 *            loop the Employemodel list
 *            print only the items where age is > 40
* */
public class SurpriseTest7 {
    public static void main(String[] args) {
        EmployeModel employeModel1= new EmployeModel();
        employeModel1.setName("John");
        employeModel1.setAge(25);
        employeModel1.setGender('M');

        EmployeModel employeModel2= new EmployeModel();
        employeModel2.setName("David");
        employeModel2.setAge(30);
        employeModel2.setGender('M');

        EmployeModel employeModel3= new EmployeModel();
        employeModel3.setName("Sam");
        employeModel3.setAge(40);
        employeModel3.setGender('M');

        List <EmployeModel> list = new ArrayList<EmployeModel>();
        list.add(employeModel1);
        list.add(employeModel2);
        list.add(employeModel3);

        for (EmployeModel employeModel : list) {
            if (employeModel.getAge() == 40) {
                System.out.println(employeModel.getName());
            }
        }

    }

}
