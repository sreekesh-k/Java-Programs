import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class JF extends JFrame implements ActionListener {
	JButton b1;

	public JF() {
		super("Swing demo..");
		b1 = new JButton("Show");
		Container c = this.getContentPane();
		c.setLayout(new FlowLayout());
		c.add(b1);
		b1.addActionListener(this);
		setSize(300, 300);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent ae) {
		System.exit(0);
	}

	public static void main(String ar[]) {
		new JF();
	}
}