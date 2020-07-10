package fundamentals.java;


//Objective add and print two number via Constructor
public class SupriseTest5 {

    public static void main(String[] args) {
        SupriseTest5 supriseTest5 = new SupriseTest5(10, 23);
    }

    public SupriseTest5(int num1, int num2) {
        System.out.println(num1 + num2);
    }

}
//constructor doesnt require return type
//constructor doesnt require object to call it
//constructor - we can pass parameters
//constructor - we dont need method name
//constructor - there can be multiple contructors with diff paramters


