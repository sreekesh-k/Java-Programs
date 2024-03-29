import java.applet.*;
import java.awt.*;

/*
<applet width=500 height=350 code="AppletImage.class">
</applet>
*/
public class AppletImage extends Applet {
	private Image img;

	public void init() {
		img = null;
	}

	public void loadImage() {
		try {
			img = getImage(getCodeBase(), "baby15.jpg");
		} catch (Exception e) {
		}
	}

	public void paint(Graphics g) {
		if (img == null)
			loadImage();
		g.drawImage(img, 0, 0, this);
	}
}