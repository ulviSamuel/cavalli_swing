package it.volta.ts.ulivisamuel.cavalli_swing.views;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import it.volta.ts.ulivisamuel.cavalli_swing.bean.Cavallo;
import it.volta.ts.ulivisamuel.cavalli_swing.interfaces.CavalloModificato;

@SuppressWarnings("serial")
public class CavalloView extends JLabel implements CavalloModificato
{
	private Cavallo model;
	
	//---------------------------------------------------------------------------------------------
	
	public CavalloView(ImageIcon cavalloImg, Cavallo model)
	{
		this.setIcon(cavalloImg);
		this.model = model;
		model.aggiungiAscoltatore(this);
	}
	
	//---------------------------------------------------------------------------------------------

	@Override
	public void cavalloModificato(Cavallo cavallo) 
	{
		this.setBounds(cavallo.getPosizione(), this.getY(), this.getWidth(), this.getHeight());
	}
}
