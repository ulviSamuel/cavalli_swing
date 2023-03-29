package it.volta.ts.ulivisamuel.cavalli_swing.bean;

import java.util.ArrayList;
import java.util.List;

import it.volta.ts.ulivisamuel.cavalli_swing.business.Fantino;

public class Gioco
{
	private int           percPosPartenza;
	private int           percPosArrivo;
	private List<Fantino> fantini;
	
	//---------------------------------------------------------------------------------------------
	
	public Gioco(int percPosPartenza, int percPosArrivo)
	{
		this.percPosPartenza = percPosPartenza;
		this.percPosArrivo   = percPosArrivo;
		fantini              = new ArrayList<Fantino>();
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
	
	public List<Fantino> getFantini()
	{
		return fantini;
	}
	
	

	public void setPercPosPartenza(int percPosPartenza) 
	{
		this.percPosPartenza = percPosPartenza;
	}

	public void setPercPosArrivo(int percPosArrivo)
	{
		this.percPosArrivo = percPosArrivo;
	}
	
	public void setFantini(List<Fantino> fantini) 
	{
		this.fantini = fantini;
	}
	
	//---------------------------------------------------------------------------------------------
	
	public void addFantino(Fantino fantino)
	{
		fantini.add(fantino);
	}
}
