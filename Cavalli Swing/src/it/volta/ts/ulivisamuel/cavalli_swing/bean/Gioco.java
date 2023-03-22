package it.volta.ts.ulivisamuel.cavalli_swing.bean;

import java.util.List;

public class Gioco 
{
	private int percPosPartenza;
	private int percPosArrivo;
	private List<Cavallo> cavalli;
	
	//---------------------------------------------------------------------------------------------
	
	public Gioco(int percPosPartenza, int percPosArrivo)
	{
		this.percPosPartenza = percPosPartenza;
		this.percPosArrivo   = percPosArrivo;
	}
	
	//---------------------------------------------------------------------------------------------

	public int getPercPosPartenza() 
	{
		return percPosPartenza;
	}

	public int getPercPosArrivo()
	{
		return percPosArrivo;
	}

	public void setPercPosPartenza(int percPosPartenza) 
	{
		this.percPosPartenza = percPosPartenza;
	}

	public void setPercPosArrivo(int percPosArrivo)
	{
		this.percPosArrivo = percPosArrivo;
	}
}
