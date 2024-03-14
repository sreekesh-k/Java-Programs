class Stat  {
    static int a;
    static int b;
    static String s;
    static {
        a = 10;
        b = 20;
    }
    static {
        s = "Test";
    }
    public static void dispVal() {
        System.out.println("a = " + a + " b = " + b + " s = " + s);
    }
        
}
public class statfunc{

     public static void main(String []args){
        Stat.dispVal();
     }
}