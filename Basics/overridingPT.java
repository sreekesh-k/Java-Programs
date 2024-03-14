class CPerson {
    int age;
    String name;

    public CPerson() { // constructor
        age = 0;
        name = "";
    }

    public CPerson(int a, String n) { // constructor
        age = a;
        name = n;
    }

    public void disp() { // member function
        System.out.println("Nmae :" + name + " Age :" + age);
    }
}

class CTeacher extends CPerson {
    String subj;

    public CTeacher() { // constructor
        age = 0;
        name = "";
    }

    public CTeacher(int a, String n, String s) { // constructor
        subj = s;
    }

    public void disp() { // member function
        System.out.println("Subject :" + subj);
    }
}

public class overridingPT {

    public static void main(String[] args) {
        CPerson p = new CPerson(20, "ssss"); // Base class object
        CTeacher t = new CTeacher(30, "dddd", "cs"); // Derived class object
        p.disp(); // call the base class methods
        t.disp(); // call only the derived class method
    }
}