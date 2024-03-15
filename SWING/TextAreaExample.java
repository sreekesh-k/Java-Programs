import java.io.*;
import java.lang.*;
import javax.swing.*;
import java.awt.event.*;

public class TextAreaExample implements ActionListener {
  JLabel l1;
  JTextArea area;
  JButton b;

  TextAreaExample() {
    JFrame f = new JFrame();
    l1 = new JLabel();
    l1.setBounds(50, 25, 100, 30);
    area = new JTextArea();
    area.setBounds(20, 75, 250, 200);
    b = new JButton("Count Characters");
    b.setBounds(100, 300, 120, 30);
    b.addActionListener(this);
    f.add(l1);
    f.add(area);
    f.add(b);
    f.setSize(450, 450);
    f.setLayout(null);
    f.setVisible(true);
  }

  public void actionPerformed(ActionEvent e) {
    String text = area.getText();
    l1.setText("Characters: " + text.length());
  }

  public static void main(String[] args) {
    new TextAreaExample();
  }
}