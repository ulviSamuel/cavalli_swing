package it.volta.ts.ulivisamuel.cavalli_swing.main;

import javax.swing.JFrame;

import it.volta.ts.ulivisamuel.cavalli_swing.business.Fantino;
import it.volta.ts.ulivisamuel.cavalli_swing.views.MainView;

public class Main 
{
	public static void main(String[] args)
	{
		JFrame frame = new MainView();
		frame.setVisible(true);
		new Fantino(Config.getInstanza().getCavallo1()).run();
		new Fantino(Config.getInstanza().getCavallo2()).run();
		new Fantino(Config.getInstanza().getCavallo3()).run();
		new Fantino(Config.getInstanza().getCavallo4()).run();
	}
}
