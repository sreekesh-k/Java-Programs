final class CBase {	
    public final void  disp() {
	System.out.println("Final Method");
    }
}

public class FinalKeywrdFunc{

     public static void main(String []args){
        CBase obj = new CBase();
        obj.disp();
     }
}