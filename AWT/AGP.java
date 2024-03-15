import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

class AWTGraphics extends Frame {

   public AWTGraphics() {
      super("Java AWT Graphics");
      setSize(400, 400);
      addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent) {
            System.exit(0);
         }
      });
   }

   public void paint(Graphics g) {
      g.setColor(Color.GRAY);
      Font font = new Font("Serif", Font.PLAIN, 24);
      g.setFont(font);
      g.drawString("Welcome to Paint in AWT", 50, 150);
      g.drawRect(100, 100, 300, 300);
      g.drawLine(100, 100, 300, 300);
   }
}

class AGP {
   public static void main(String[] args) {
      AWTGraphics obj = new AWTGraphics();
      obj.setVisible(true);
   }

}