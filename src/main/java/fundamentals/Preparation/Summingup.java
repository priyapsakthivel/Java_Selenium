package fundamentals.Preparation;

public class Summingup {
    int sum1=11;
    int sum2=12;
    int sum3=42;
    int sum4=44;
    public static void main(String[]args){
       Summingup obj = new Summingup();
       obj.adding1(obj.sum1, obj.sum2);
       obj.adding2(obj.sum3, obj.sum4);
    }
    public void adding1(int sum1,int sum2){
        System.out.println("sum of first 2 numbers"+sum1+sum2);
    }
    public void adding2(int sum3,int sum4){
        System.out.println("sum of second 2 numbers"+sum3+sum4);
    }
}
