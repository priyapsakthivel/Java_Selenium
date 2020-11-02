package fundamentals.java;

public class All_the_Best {
    public static void main(String[]args){
       All_the_Best best= new All_the_Best();
       best.exam();
    }
    public int exam(){
        int a = 0;
        for(int i =1;i<=10;i++){
            if(a==i/2){System.out.println("All the best for your exam");}
            else{System.out.println("do ur best");
            return i++ ; }
        }
        return a;}
    {for(int j= 1;j<=10;j--){
            System.out.println("u are doing great");
        }
    }
}
