import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*
<APPLET CODE="PlaySoundApplet.class" WIDTH="400" HEIGHT="50">
</APPLET> 
*/

public class PlaySoundApplet extends Applet implements ActionListener {
	Button play, stop;
	AudioClip p;

	public void init() {
		play = new Button("  Play in Loop  ");
		add(play);
		play.addActionListener(this);
		stop = new Button("  Stop  ");
		add(stop);
		stop.addActionListener(this);
		p = getAudioClip(getCodeBase(), "play.wav");
	}

	public void actionPerformed(ActionEvent ae) {
		Button source = (Button) ae.getSource();
		if (source.getLabel() == "  Play in Loop  ") {
			p.play();
		} else if (source.getLabel() == "  Stop  ") {
			p.stop();
		}
	}
}