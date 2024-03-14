class CBase {	
    public final void  disp() {
	System.out.println("Final Method");
    }
}
class CDerived extends CBase {	
    public final void  disp() {
	System.out.println("Final Method");
    }
}

public class FinalKeywrdCls1{

     public static void main(String []args){
        CFinal obj = new CFinal();
        obj.disp();
     }
}