class CFinal {
    public void change(final int a) {
        // a = 20; //trying to change a final variable
    }

    public void disp(final int a) {
        System.out.println(a);
    }
}

public class FinalKeywrd1 {

    public static void main(String[] args) {
        CFinal obj = new CFinal();
        final int a = 5;
        obj.change(a); // error
        obj.disp(a);
    }
}