package it.volta.ts.ulivisamuel.cavalli_swing.business;

import it.volta.ts.ulivisamuel.cavalli_swing.bean.Cavallo;
import it.volta.ts.ulivisamuel.cavalli_swing.main.Config;

public class Fantino extends Thread
{
	private Cavallo cavallo;
	
	//---------------------------------------------------------------------------------------------
	
	public Fantino(Cavallo cavallo)
	{
		this.cavallo = cavallo;
	}
	
	//---------------------------------------------------------------------------------------------
	
	public void run()
	{
		for(int idx = 0; idx < 10; ++idx)
			corri();
	}
	
	//---------------------------------------------------------------------------------------------
	
	private void corri()
	{
		cavallo.setPosizione(cavallo.getPosizione() + Config.getInstanza().getIncrementoCorsa());
		pause(((int)(1 + Math.random() * 2)) * cavallo.getHandicap());
	}
	
	//---------------------------------------------------------------------------------------------
	
	private void pause(long time)
	{
		try 
		{
			Thread.sleep(time);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}
}
