package it.volta.ts.ulivisamuel.cavalli_swing.views;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import it.volta.ts.ulivisamuel.cavalli_swing.Config;

@SuppressWarnings("serial")
public class CorsiaView extends JPanel
{
	public CorsiaView(ImageIcon cavalloImg)
	{
		this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		this.add(new JLabel(cavalloImg));
		this.add(new JLabel(Config.getInstanza().getTrack()));
	}
}
