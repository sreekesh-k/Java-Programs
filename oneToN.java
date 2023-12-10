import java.io.*;

public class oneToN {
    public static void main(String[] args) {
        int m, n;
        DataInputStream din = new DataInputStream(System.in);
        try {
            System.out.print("Enter number(Start): ");
            m = Integer.parseInt(din.readLine());
            System.out.print("Enter number(End): ");
            n = Integer.parseInt(din.readLine());
            while (m <= n)
                System.out.print(m++ + " ");
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
    }
}
