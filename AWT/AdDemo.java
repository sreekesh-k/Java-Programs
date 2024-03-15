import java.awt.*;
import java.awt.event.*;

class CAd extends Frame {

   private Label hl;
   private Label sl;
   private Panel cp;

   public CAd() {

      super("Java AWT Examples");
      setSize(400, 400);
      setLayout(new GridLayout(3, 1));

      addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent) {
            System.exit(0);
         }
      });

      hl = new Label();
      hl.setAlignment(Label.CENTER);
      sl = new Label();
      sl.setAlignment(Label.CENTER);
      sl.setSize(350, 100);

      cp = new Panel();
      cp.setLayout(new FlowLayout());

      add(hl);
      add(cp);
      add(sl);
      setVisible(true);
   }

   public void showMouseAdapter() {
      hl.setText("Listener in action: MouseAdapter");

      Panel panel = new Panel();
      panel.setBackground(Color.magenta);
      panel.setLayout(new FlowLayout());
      panel.addMouseListener(
            new MouseAdapter() {
               public void mouseClicked(MouseEvent e) {
                  sl.setText("Mouse Clicked: (" + e.getX() + ", " + e.getY() + ")");
               }
            });

      Label l = new Label();
      l.setAlignment(Label.CENTER);
      l.setText("Welcome to Adapter Demo.");

      l.addMouseListener(new MouseAdapter() {
         public void mouseClicked(MouseEvent e) {
            sl.setText("Mouse Clicked: ("
                  + e.getX() + ", " + e.getY() + ")");
         }
      });
      panel.add(l);
      cp.add(panel);
      setVisible(true);
   }
}

class AdDemo {
   public static void main(String[] args) {
      CAd obj = new CAd();
      obj.showMouseAdapter();
   }
}