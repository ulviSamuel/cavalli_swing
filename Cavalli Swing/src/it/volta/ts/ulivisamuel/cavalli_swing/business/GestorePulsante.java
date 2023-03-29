package it.volta.ts.ulivisamuel.cavalli_swing.business;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GestorePulsante implements ActionListener
{
	private GestoreGioco gestore;
	public final static String startAndStop = "startAndStop";
	
	//---------------------------------------------------------------------------------------------
	
	public GestorePulsante()
	{
		gestore = null;
	}
	
	//---------------------------------------------------------------------------------------------
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		String com = e.getActionCommand();
		switch (com) 
		{
		case startAndStop:
			startAndStop();
			break;

		default:
			break;
		}
	}
	
	//---------------------------------------------------------------------------------------------
	
	private void startAndStop()
	{
		if(gestore != null)
			gestore.interrompiThread();
		gestore = new GestoreGioco();
		gestore.start();
	}
}
