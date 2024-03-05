import java.io.*;

public class areaCircle {
    public static void main(String[] args) {

        System.out.println("Calculate Area of a circle");
        System.out.println("__________________________");
        area();

    }

    private static void area() {
        DataInputStream din = new DataInputStream(System.in);
        System.out.print("Enter radius of the circle: ");
        try {
            int r = Integer.parseInt(din.readLine());
            double area = 3.14 * r;
            System.out.println("Area = " + area);
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
    }
}
