import java.awt.event.*;
import javax.swing.*;

class BD extends JFrame implements ActionListener {
  JButton b;
  JTextField tf;

  public BD() {
    super("Button Example");
    tf = new JTextField();
    tf.setBounds(50, 50, 150, 20);
    b = new JButton("Click Here");
    b.setBounds(50, 100, 95, 30);
    b.addActionListener(this);
    add(b);
    add(tf);
    setSize(400, 400);
    setLayout(null);
    setVisible(true);
  }

  public void actionPerformed(ActionEvent e) {
    tf.setText("Welcome to Java.");
  }
}

class JSBD {
  public static void main(String[] args) {
    new BD();
  }
}