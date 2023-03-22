package it.volta.ts.ulivisamuel.cavalli_swing.main;

public class Config 
{
	private static Config    istanza         = null;
	private        int       incrementoCorsa = 10;
	
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

	public void setIncrementoCorsa(int incrementoCorsa) 
	{
		this.incrementoCorsa = incrementoCorsa;
	}
}
