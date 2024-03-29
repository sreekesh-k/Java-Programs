import java.awt.*;
import java.applet.*;

/*
<applet width=500 height=350 code="AppDraw.class">
</applet>
*/
public class AppDraw extends Applet {
      String str;

      public void init() {
            str = "Welcome to Applet programming...";
      }

      public void paint(Graphics g) {
            g.drawString(str, 100, 150);
      }
}