class Address {
    public String city, state, country;

    public Address(String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
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

    public static void shallowcopy() throws CloneNotSupportedException {
        Address a1 = new Address("Ghaziabad", "U.P.", "INDIA");
        Employee e1 = new Employee(101, "Shweta", a1);

        Employee e2 = (Employee) e1.clone();

        System.out.println("Actual Object:-\n" + e1);
        System.out.println("Cloned Object:- \n" + e2);

        // Proof of same a1 object with both e1 and e2
        System.out.println("Actual Object with address object:-\n" + e1.a1.hashCode());
        System.out.println("Cloned Object with address object:- \n" + e2.a1.hashCode()); // both have same hashcode
    }
}

class shallowcpy {
    public static void main(String sd[]) throws CloneNotSupportedException {
        Employee.shallowcopy();
    }
}