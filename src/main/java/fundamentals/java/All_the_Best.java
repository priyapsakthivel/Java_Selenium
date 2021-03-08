package fundamentals.java;

public class All_the_Best {
    public static void main(String[]args) throws InterruptedException {
       All_the_Best best= new All_the_Best();
       best.exam();
    }
    public int exam() throws InterruptedException {
        int a = 0;
        for(int i =1;i<=11;i+){
            if(a==i/2){System.out.println("All the best for your exam");}
            else{System.out.println("do ur best");
                Thread.sleep(2000);
            return i++ ; }
        }
        return a;}
    {for(int j= 1;j<=10;j++){
            System.out.println("u are doing great");

        }
    }
}
