import java.awt.*;
import java.applet.*;

public class AppAdd extends Applet {
    String str;
    int a, b, result;

    public void init() {
        str = getParameter("a");
        a = Integer.parseInt(str);
        str = getParameter("b");
        b = Integer.parseInt(str);
        result = a + b;
        str = String.valueOf(result);
    }

    public void paint(Graphics g) {
        g.drawString(" Result of Addition is : " + str, 0, 15);
    }
}