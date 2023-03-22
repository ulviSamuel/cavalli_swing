package it.volta.ts.ulivisamuel.cavalli_swing.bean;

public class Cavallo 
{
	private int posizione;
	private int handicap;
	
	//---------------------------------------------------------------------------------------------
	
	public Cavallo(int posizione, int handicap)
	{
		this.posizione = posizione;
		this.handicap  = handicap;
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
	}
	
	public void setHandicap(int handicap)
	{
		this.handicap = handicap;
	}
}
