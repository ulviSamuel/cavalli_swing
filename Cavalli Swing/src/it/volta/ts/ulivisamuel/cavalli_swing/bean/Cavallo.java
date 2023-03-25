package it.volta.ts.ulivisamuel.cavalli_swing.bean;

import java.util.ArrayList;
import java.util.List;

import it.volta.ts.ulivisamuel.cavalli_swing.interfaces.CavalloModificato;

public class Cavallo 
{
	private int posizione;
	private int handicap;
	private List<CavalloModificato> ascoltatori;
	
	//---------------------------------------------------------------------------------------------
	
	public Cavallo(int posizione, int handicap)
	{
		this.posizione = posizione;
		this.handicap  = handicap;
		ascoltatori    = new ArrayList<CavalloModificato>();
	}
	
	//---------------------------------------------------------------------------------------------
	
	public int getPosizione() 
	{
		return posizione;
	}
	
	public int getHandicap() 
	{
		return handicap;
	}
	
	public void setPosizione(int posizione) 
	{
		this.posizione = posizione;
		avvisaAscoltatoriModifica();
	}
	
	public void setHandicap(int handicap)
	{
		this.handicap = handicap;
		avvisaAscoltatoriModifica();
	}
	
	//---------------------------------------------------------------------------------------------
	
	public void aggiungiAscoltatore(CavalloModificato ascoltatore)
	{
		ascoltatori.add(ascoltatore);
	}
	
	public void rimuoviAscoltatore(CavalloModificato ascoltatore)
	{
		ascoltatori.remove(ascoltatore);
	}
	
	//---------------------------------------------------------------------------------------------
	
	private void avvisaAscoltatoriModifica()
	{
		for(CavalloModificato ascoltatore : ascoltatori)
			ascoltatore.cavalloModificato(this);
	}
}