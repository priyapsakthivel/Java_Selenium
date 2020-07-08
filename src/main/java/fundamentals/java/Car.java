package fundamentals.java;

public class Car extends Vehicle {
    public static void main(String[] args) {
        Vehicle vehicle= new Car();
        vehicle.lambo();
    }
    public void audi(){
        System.out.println("audi");
    }
    public void ferrari(){
        System.out.println("ferrari");
    }


}
