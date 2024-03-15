import java.io.*;
import java.awt.*;
import java.awt.event.*;

class CTF extends Frame implements ActionListener {
	Button b1, b2;
	Label l1, l2, l3;
	TextField t1, t2, t3;

	public CTF() {
		super("Calculate....");
		l1 = new Label("No 1");
		l2 = new Label("No 2");
		l3 = new Label("Result");
		t1 = new TextField(10);
		t2 = new TextField(10);
		t3 = new TextField(10);
		b1 = new Button(" + ");
		b2 = new Button(" - ");
		setLayout(new GridLayout(4, 2));
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b1);
		add(b2);
		add(l3);
		add(t3);
		b1.addActionListener(this);
		b2.addActionListener(this);
		setSize(500, 500);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent ae) {
		try {
			int a, b, s = 0;
			a = Integer.parseInt(t1.getText());
			b = Integer.parseInt(t2.getText());
			if (ae.getSource() == b1) {
				s = a + b;
			} else if (ae.getSource() == b2) {
				s = a - b;
			}
			t3.setText("" + s);
		} catch (Exception e) {
		}
	}
}

class Clac {
	public static void main(String args[]) {
		CTF obj = new CTF();
	}
}