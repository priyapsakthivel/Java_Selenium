package fundamentals.java;

public class Test1 {
    public static void main (String [] args) {

        System.out.println("ravi");
        Test1 objname=new Test1();
        objname.name();
        System.out.println(objname.adding(10,93));
    }
    public void name() {
        System.out.println("rithika");
    }

    public int adding(int a,int b){
        return(a+b);
    }
}
