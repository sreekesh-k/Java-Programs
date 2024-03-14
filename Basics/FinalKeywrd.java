class CFinal {	
    final int a=10;		//variable declared as final
    public void change() {
       // a = 20;			//trying to change a final variable
    }
    public void disp() {
        System.out.println(a);	
    }
}
public class FinalKeywrd{

     public static void main(String []args){
        CFinal obj = new CFinal();
       // obj.change();		//error
        obj.disp();
     }
}