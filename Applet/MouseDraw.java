import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code="MouseDraw" width=500 height=500>
</applet>
*/
public class MouseDraw extends Applet implements MouseListener, MouseMotionListener {
	int X = 0, Y = 20, x, y, f;
	String msg = "MouseEvents";

	public void init() {
		f = 0;
		addMouseListener(this);
		addMouseMotionListener(this);
	}

	public void mouseEntered(MouseEvent m) {
		showStatus("Mouse Entered");
	}

	public void mouseExited(MouseEvent m) {
		showStatus("Mouse Exited");
	}

	public void mousePressed(MouseEvent m) {
		f = 1;
		X = m.getX();
		Y = m.getY();
		// System.out.println("" + X + " " + Y + " " + f);
	}

	public void mouseReleased(MouseEvent m) {
		// f = 0;
		x = m.getX();
		y = m.getY();
		repaint();
	}

	public void mouseMoved(MouseEvent m) {
	}

	public void mouseDragged(MouseEvent m) {
		if (f == 1) {
			x = X;
			y = Y;
			X = m.getX();
			Y = m.getY();
			// System.out.println(x + " " + y + " , " + X + " " + Y + " " + f);
			repaint();
		}
	}

	public void mouseClicked(MouseEvent m) {
		showStatus("Mouse Clicked");
	}

	public void paint(Graphics g) {
		g.setXORMode(Color.white);
		g.drawLine(10, 10, 300, 300);
		System.out.println(x + "  " + y + " , " + X + " " + Y + " " + f);
		g.drawLine(x, y, X, Y);
		// g.setPaintMode();
	}
}