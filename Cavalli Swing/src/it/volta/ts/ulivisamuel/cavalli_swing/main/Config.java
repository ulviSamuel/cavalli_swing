package it.volta.ts.ulivisamuel.cavalli_swing.main;

import it.volta.ts.ulivisamuel.cavalli_swing.bean.Cavallo;

public class Config 
{
	private static Config    istanza          = null;
	private        int       incrementoCorsa  = 10;
	private        Cavallo   cavallo1         = new Cavallo(0, 100);
	private        Cavallo   cavallo2         = new Cavallo(0, 100);
	private        Cavallo   cavallo3         = new Cavallo(0, 100);
	private        Cavallo   cavallo4         = new Cavallo(0, 100);
	
	//---------------------------------------------------------------------------------------------

	private Config() {}

	//---------------------------------------------------------------------------------------------
	
	private synchronized static Config creaInstanza()
	{
		if (istanza == null) 
			istanza = new Config();
		return istanza;
	}
	
	//---------------------------------------------------------------------------------------------

	public static Config getInstanza() 
	{
		if (istanza == null) 
			creaInstanza();
		return istanza;
	}
	
	//---------------------------------------------------------------------------------------------

	public int getIncrementoCorsa()
	{
		return incrementoCorsa;
	}

	public Cavallo getCavallo1() 
	{
		return cavallo1;
	}

	public Cavallo getCavallo2() 
	{
		return cavallo2;
	}

	public Cavallo getCavallo3() 
	{
		return cavallo3;
	}

	public Cavallo getCavallo4() 
	{
		return cavallo4;
	}
	
	

	public void setIncrementoCorsa(int incrementoCorsa) 
	{
		this.incrementoCorsa = incrementoCorsa;
	}

	public void setCavallo1(Cavallo cavallo1) 
	{
		this.cavallo1 = cavallo1;
	}

	public void setCavallo2(Cavallo cavallo2)
	{
		this.cavallo2 = cavallo2;
	}

	public void setCavallo3(Cavallo cavallo3) 
	{
		this.cavallo3 = cavallo3;
	}

	public void setCavallo4(Cavallo cavallo4)
	{
		this.cavallo4 = cavallo4;
	}
}
