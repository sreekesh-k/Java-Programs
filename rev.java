import java.io.*;

public class rev {
    public static void main(String[] args) {
        DataInputStream din = new DataInputStream(System.in);
        try {
            System.out.print("Enter a number to be reversed: ");
            int n = Integer.parseInt(din.readLine());
            reverse(n);
        } catch (Exception e) {
            System.out.println("Error " + e);
        }

    }

    private static void reverse(int n) {
        int rev = 0;
        while (n != 0) {
            rev = (rev * 10) + n % 10;
            n = n / 10;
        }
        System.out.println("reverse = " + rev);
    }
}
