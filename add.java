import java.io.*;

public class add {

    public static void main(String[] args) {

        DataInputStream din = new DataInputStream(System.in);
        int a, b;
        try {
            System.out.print("Enter 1st Number: ");
            a = Integer.parseInt(din.readLine());
            System.out.print("Enter 2nd Number: ");
            b = Integer.parseInt(din.readLine());
            System.out.println("Sum of " + a + " and " + b + " is " + (a + b));
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
    }

}
