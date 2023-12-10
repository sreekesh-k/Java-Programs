import java.io.*;

public class sumOfNFact {
    public static void main(String[] args) {
        int i, n;
        double sum = 0;
        DataInputStream din = new DataInputStream(System.in);
        try {
            System.out.print("Enter number: ");
            n = Integer.parseInt(din.readLine());

            for (i = 1; i <= n; i++) {
                sum += (double) i / fact(i);
            }
            System.out.println("Sum = " + sum);
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
    }

    private static int fact(int n) {
        if (n != 0) {
            return n * fact(n - 1);
        }
        return 1;
    }
}
