package fundamentals.Preparation;

public class Summingup {
    int sum1=11;
    int sum2=12;
    public static void main(String[]args){
       Summingup obj = new Summingup();
       obj.adding(obj.sum1, obj.sum2);
    }
    public void adding(int sum1,int sum2){
        System.out.println(sum1+sum2);
    }
}
