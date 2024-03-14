class Address implements Cloneable {
    public String city, state, country;

    public Address(String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Employee implements Cloneable {
    int id;
    String name;
    Address a1;

    public Employee(int id, String name, Address a1) {
        this.id = id;
        this.name = name;
        this.a1 = a1;
    }

    public String toString() {
        return "id:- " + id + " ,name:- " + name + " ,city:- " + a1.city + " ,state:- " + a1.state + " ,country:- "
                + a1.country;
    }

    public Object clone() throws CloneNotSupportedException {
        Employee e1 = (Employee) super.clone();

        e1.a1 = (Address) a1.clone();

        return e1;
    }

    public static void deepcopy() throws CloneNotSupportedException {
        Address a1 = new Address("Ghaziabad", "U.P.", "INDIA");
        Employee e1 = new Employee(101, "Shweta", a1);

        Employee e2 = (Employee) e1.clone();

        System.out.println("Actual Object:-\n" + e1);
        System.out.println("Cloned Object:- \n" + e2);

        // Proof of different Address object with e1 and e2
        System.out.println("Actual Object with address object:-\n" + e1.a1.hashCode());
        System.out.println("Cloned Object with address object:- \n" + e2.a1.hashCode()); // both have different hashcode
    }

}

class deepcpy {
    public static void main(String sd[]) throws CloneNotSupportedException {
        Employee.deepcopy();
    }
}