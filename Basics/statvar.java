
class Stat  {
    private static int s; // private so cant access outside the class
    public static int k;  // public can be accessed outside the class
    
    public static void setVal() {   // static method
        s = 10;
    }
    public static void dispVal() {
        System.out.println("s = " + s + " k = " + k);
    }
        
}
public class statvar{

     public static void main(String []args){
        Stat.k = 20;
        Stat.setVal();          // Object is not required for calling static methdos
        Stat.dispVal();
     }
}