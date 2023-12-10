import java.io.*;

public class sumOfDgits {
    public static void main(String[] args) {
        DataInputStream din = new DataInputStream(System.in);
        try {
            System.out.print("Enter a number: ");
            int n = Integer.parseInt(din.readLine());
            System.out.println("Sum of its digits = " + sum(n));
        } catch (Exception e) {
            System.out.println("Error " + e);
        }

    }

    private static int sum(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }
}
