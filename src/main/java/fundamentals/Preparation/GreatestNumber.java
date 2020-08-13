package fundamentals.Preparation;

public class GreatestNumber {
    public static void main(String[] args) {
        int[] numbers= {9,2,5,6,8};
        int a=0;
        for (int i=1;i< numbers.length;i++){
            if(i<=a){
                System.out.println("highest number in the list"+a);
            }
            else{
                a=i+1;
                System.out.println(a);
            }
        }
    }
}
