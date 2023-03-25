package it.volta.ts.ulivisamuel.cavalli_swing.views;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import it.volta.ts.ulivisamuel.cavalli_swing.bean.Cavallo;

@SuppressWarnings("serial")
public class CorsiaView extends JPanel
{
	public CorsiaView(ImageIcon cavalloImg, Cavallo model)
	{
		this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		this.add(new CavalloView(cavalloImg, model));
		this.add(new JLabel(new ImageIcon("img\\track.png")));
	}
}
