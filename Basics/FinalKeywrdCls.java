final class CBase {	
    public void  disp() {
	System.out.println("Final Method");
    }
}

class CDerived extends CBase {	
    public void  disp() {
	System.out.println("Final Method");
    }
}

public class FinalKeywrdCls{

     public static void main(String []args){
        CDerived obj = new CDerived();
        obj.disp();
     }
}