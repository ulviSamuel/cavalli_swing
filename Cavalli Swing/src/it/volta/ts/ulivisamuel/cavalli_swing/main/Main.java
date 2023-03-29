package it.volta.ts.ulivisamuel.cavalli_swing.main;

import javax.swing.JFrame;

import it.volta.ts.ulivisamuel.cavalli_swing.business.GestoreGioco;
import it.volta.ts.ulivisamuel.cavalli_swing.views.MainView;

public class Main 
{
	public static void main(String[] args)
	{
		JFrame frame = new MainView();
		frame.setVisible(true);
		new GestoreGioco().start();
	}
}
