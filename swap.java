import java.io.*;

public class swap {

    public static void main(String[] args) {

        DataInputStream din = new DataInputStream(System.in);
        int a, b, temp;
        try {
            System.out.print("Enter 1st Number: ");
            a = Integer.parseInt(din.readLine());
            System.out.print("Enter 2nd Number: ");
            b = Integer.parseInt(din.readLine());
            System.out.println("1st number is " + a + " and 2nd number is " + b);
            System.out.println("After swaping..");
            temp = a;
            a = b;
            b = temp;
            System.out.println("1st number is " + a + " and 2nd number is " + b);
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
    }

}
