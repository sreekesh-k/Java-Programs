import java.io.*;
import java.awt.*;
import java.awt.event.*;

class CTF extends Frame implements ActionListener, ItemListener {
	Button b3;
	TextField t1, t2;

	public CTF() {
		super("Textfield Demo....");
		t1 = new TextField(10);
		t2 = new TextField(10);
		b3 = new Button("Exit");
		setLayout(new FlowLayout());
		add(t1);
		add(t2);
		add(b3);
		t1.addActionListener(this);
		b3.addActionListener(this);

		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent) {
				setVisible(false);
				System.exit(0);
			}
		});

		setSize(200, 200);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == b3) {
			System.exit(0);
		} else if (ae.getSource() == t1) {
			String str = t1.getText();
			try {
				int a = Integer.parseInt(str);
				Dialog d = new Dialog(this, "Valid Input...", true);
				d.add(new Label("Valid Input.."));
				d.addWindowListener(new WindowAdapter() {
					public void windowClosing(WindowEvent windowEvent) {
						d.setVisible(false);
						d.dispose();
					}
				});
				d.setSize(100, 100);
				d.setVisible(true);
			} catch (Exception e) {
				Dialog d = new Dialog(this, "Error : inValid Input...", true);
				d.add(new Label("Invalid Input.."));
				d.addWindowListener(new WindowAdapter() {
					public void windowClosing(WindowEvent windowEvent) {
						d.setVisible(false);
						System.exit(0);
					}
				});
				d.setSize(100, 100);
				d.setVisible(true);
			}
			t2.setText(str);
		}
	}

	public void itemStateChanged(ItemEvent ie) {
		if (ie.getSource() == t1) {
			String str = t1.getText();
			t2.setText(str);
		}
	}
}

class TextFieldDemo1 {
	public static void main(String args[]) {
		CTF obj = new CTF();
	}
}