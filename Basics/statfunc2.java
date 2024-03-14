class Stat  {
    static class Test {				//static nested class
        public static void disp() {
            System.out.println("Nesting static disp ");
        }
    }
    public static void disp() {
        Test.disp();			//invoking the nested class static method
    }
        
}
public class statfunc2{

     public static void main(String []args){
        Stat.disp();			//invoking the outer static class method
     }
}