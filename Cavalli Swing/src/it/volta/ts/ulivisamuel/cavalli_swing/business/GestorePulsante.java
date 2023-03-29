package it.volta.ts.ulivisamuel.cavalli_swing.business;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GestorePulsante implements ActionListener
{
	private GestoreGioco gestore;
	public final static String start = "start";
	
	//---------------------------------------------------------------------------------------------
	
	public GestorePulsante(GestoreGioco gestore)
	{
		gestore = new GestoreGioco();
	}
	
	//---------------------------------------------------------------------------------------------
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		String com = e.getActionCommand();
		switch (com) 
		{
		case start:
			
			break;

		default:
			break;
		}
	}
}
