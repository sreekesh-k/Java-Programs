import java.io.*;

public class product {

    public static void main(String[] args) {

        DataInputStream din = new DataInputStream(System.in);
        int a, b;
        try {
            System.out.print("Enter 1st Number: ");
            a = Integer.parseInt(din.readLine());
            System.out.print("Enter 2nd Number: ");
            b = Integer.parseInt(din.readLine());
            System.out.println(a + " times " + b + " is " + (a * b));
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
    }

}
