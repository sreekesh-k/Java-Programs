//function over riding
class CBase {
    public final void disp() {
        System.out.println("Final Method in the base class");
    }

    public void show() {
        System.out.println("Show Method in the base class");
    }
}

class CDerived extends CBase {
    public void show() {
        super.show();
        System.out.println("Show Method in the DC");
    }
}

public class FuncOverRid {

    public static void main(String[] args) {
        CDerived obj = new CDerived();
        obj.disp();
        obj.show();
    }
}