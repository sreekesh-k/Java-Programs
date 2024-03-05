import java.io.*;

public class max {

    public static void main(String[] args) {

        DataInputStream din = new DataInputStream(System.in);
        int a, b, c, max;
        try {
            System.out.print("Enter 1st Number: ");
            a = Integer.parseInt(din.readLine());
            System.out.print("Enter 2nd Number: ");
            b = Integer.parseInt(din.readLine());
            System.out.print("Enter 3rd Number: ");
            c = Integer.parseInt(din.readLine());
            max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
            System.out.println("The maximum number is: " + max);

        } catch (Exception e) {
            System.out.println("Error " + e);
        }
    }

}
