import java.io.*;
import java.awt.*;
import java.awt.event.*;

class CLB extends Frame implements ActionListener, ItemListener {
	Button badd, bsel, bdel, b3;
	TextField t1;
	List l;

	public CLB() {
		super("Listbox Demo....");
		t1 = new TextField(10);
		l = new List(10);
		badd = new Button("ADD");
		bsel = new Button("SELECTED");
		bdel = new Button("DELETED");
		b3 = new Button("Exit");
		setLayout(new FlowLayout());
		add(l);
		add(t1);
		add(badd);
		add(bsel);
		add(bdel);
		add(b3);

		badd.addActionListener(this);
		bsel.addActionListener(this);
		bdel.addActionListener(this);
		b3.addActionListener(this);
		l.addItemListener(this);

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
		} else if (ae.getSource() == badd) {
			String str = t1.getText();
			l.add(str);
			t1.setText("");
		} else if (ae.getSource() == bsel) {
			int pos;
			pos = l.getSelectedIndex();
			if (pos != -1) {
				String str = (String) l.getSelectedItem();
				t1.setText(str);
			}
		} else if (ae.getSource() == bdel) {
			int pos;
			pos = l.getSelectedIndex();
			if (pos != -1) {
				l.remove(pos);
			}
		}
	}

	public void itemStateChanged(ItemEvent ie) {
		if (ie.getSource() == l) {
			String str = (String) l.getSelectedItem();
			t1.setText(str);
		}
	}
}

class ListBoxDemo {
	public static void main(String args[]) {
		CLB obj = new CLB();
	}
}