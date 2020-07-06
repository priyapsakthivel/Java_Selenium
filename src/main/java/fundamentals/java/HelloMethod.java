package fundamentals.java;

public class HelloMethod {

    public static void main(String[] args) {

        HelloMethod helloMethod = new HelloMethod();

        helloMethod.test(10,"mohan",true);
    }

    public int addNumbers(int x,int y){
        return x+y;
    }

    public void test(int x,String y,boolean trueOrFalse){

        System.out.println(x);
        System.out.println(y);
        System.out.println(trueOrFalse);
    }

    public void helloMethod(){
        System.out.println("Hello Method");
    }

    public String helloString(){
        return "Mohan";
    }

    public int helloInteger(){
        return 70;
    }

    public boolean helloBoolean(){
        return true;
    }



}
