import java.io.*;

public class search {

    public static void main(String[] args) {

        DataInputStream din = new DataInputStream(System.in);
        int arr[] = { 1, 2, 3, 4, 5 };
        int x, i, f = 0;

        try {

            System.out.print("The elemnt to search in the array: ");
            x = Integer.parseInt(din.readLine());
            for (i = 0; i < 5; i++) {
                if (arr[i] == x) {
                    System.out.println("Element " + x + " is found in the position " + i + " in the array.");
                    f = 1;
                }
            }
            if (f != 1)
                System.out.println("Element " + x + " is not found in the array");

        } catch (Exception e) {
            System.out.println("Error " + e);
        }
    }

}
