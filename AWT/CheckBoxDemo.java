import java.io.*;
import java.awt.*;
import java.awt.event.*;

class CBD extends Frame implements ActionListener {
	Button bsel, b3;
	TextField t1;
	Checkbox c1, c2, c3;

	public CBD() {
		super("Checkbox Demo....");
		t1 = new TextField(10);
		bsel = new Button("SELECTED");
		b3 = new Button("Exit");
		c1 = new Checkbox(" SSLC ");
		c2 = new Checkbox(" PDC ");
		c3 = new Checkbox(" BCA ");
		setLayout(new FlowLayout());
		add(c1);
		add(c2);
		add(c3);
		add(t1);
		add(bsel);
		add(b3);

		bsel.addActionListener(this);
		b3.addActionListener(this);

		setSize(400, 400);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == b3) {
			System.exit(0);
		} else if (ae.getSource() == bsel) {
			String str = "";
			if (c1.getState() == true) {
				str = c1.getLabel();
			}
			if (c2.getState() == true) {
				str = str + " " + c2.getLabel();
			}
			if (c3.getState() == true) {
				str = str + " " + c3.getLabel();
			}
			t1.setText(str);
		}
	}
}

class CheckBoxDemo {
	public static void main(String args[]) {
		CBD obj = new CBD();
	}
}