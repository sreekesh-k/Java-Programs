import java.io.*;

public class sumOfN {
    public static void main(String[] args) {
        int i = 1, n, sum = 0;
        DataInputStream din = new DataInputStream(System.in);
        try {
            System.out.print("Enter number: ");
            n = Integer.parseInt(din.readLine());

            while (i <= n) {
                sum += (i * (i + 1)) / 2;
                i++;
            }
            System.out.println("Sum = " + sum);
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
    }
}
