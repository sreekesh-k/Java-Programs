import java.awt.*;
import java.awt.event.*;

class BLayout extends Frame {
	private Label hl;
	private Label sl;
	private Panel cpanel;
	private Label ml;

	public BLayout() {
		super("Java AWT Examples");
		setSize(400, 400);
		setLayout(new GridLayout(3, 1));
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent) {
				System.exit(0);
			}
		});
		hl = new Label("Header...");
		hl.setAlignment(Label.CENTER);
		sl = new Label("Satus....");
		sl.setAlignment(Label.CENTER);
		sl.setSize(350, 100);

		ml = new Label();
		ml.setAlignment(Label.CENTER);
		ml.setText("Welcome to BLdemo");

		cpanel = new Panel();
		cpanel.setLayout(new FlowLayout());

		add(hl);
		add(cpanel);
		add(sl);
		setVisible(true);
	}

	public void showBorderLayoutDemo() {
		hl.setText("Layout in action: BorderLayout");

		Panel panel = new Panel();
		panel.setBackground(Color.darkGray);
		panel.setSize(300, 300);
		BorderLayout layout = new BorderLayout();
		layout.setHgap(10);
		layout.setVgap(10);
		panel.setLayout(layout);

		panel.add(new Button("Center"), BorderLayout.CENTER);
		panel.add(new Button("Line Start"), BorderLayout.LINE_START);
		panel.add(new Button("Line End"), BorderLayout.LINE_END);
		panel.add(new Button("East"), BorderLayout.EAST);
		panel.add(new Button("West"), BorderLayout.WEST);
		panel.add(new Button("North"), BorderLayout.NORTH);
		panel.add(new Button("South"), BorderLayout.SOUTH);

		cpanel.add(panel);

		setVisible(true);
	}
}

class BLDemo {
	public static void main(String[] args) {
		BLayout obj = new BLayout();
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
		}
		obj.showBorderLayoutDemo();
	}
}