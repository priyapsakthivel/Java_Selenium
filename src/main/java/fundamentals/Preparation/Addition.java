package fundamentals.Preparation;

public class Addition {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        Addition obj= new Addition();
        int answer=obj.addition(a,b);
        System.out.println("sum of 2 numbers="+answer);

    }
    public int addition(int a,int b){
        int sum=a+b;
        return (a+b);
    }
}
