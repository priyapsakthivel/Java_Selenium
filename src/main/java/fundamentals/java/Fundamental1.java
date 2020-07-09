package fundamentals.java;

public class Fundamental1 {
    public static void main (String[]args){
        int a=10;
        int b=20;
        int c=30;
      Fundamental1 object=new Fundamental1();
      Fundamental1 object1=new Fundamental1(1,2);
      int add_object=object.addition(a,b,c);
        System.out.println(add_object);
    }
    public int addition (int a,int b,int c){
        return(a+b+c);
    }
    public Object anything(){
        return(2143546780);
    }
    public Fundamental1(int d,int e){

    }
    public Fundamental1(){

    }
}
