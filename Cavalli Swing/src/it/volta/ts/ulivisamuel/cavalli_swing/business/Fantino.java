package it.volta.ts.ulivisamuel.cavalli_swing.business;

import it.volta.ts.ulivisamuel.cavalli_swing.bean.Cavallo;
import it.volta.ts.ulivisamuel.cavalli_swing.main.Config;

public class Fantino extends Thread
{
	private Cavallo cavallo;
	private boolean interrotto;
	
	//---------------------------------------------------------------------------------------------
	
	public Fantino(Cavallo cavallo)
	{
		this.cavallo = cavallo;
		interrotto   = false;
	}
	
	//---------------------------------------------------------------------------------------------
	
	public int getPosizione()
	{
		return cavallo.getPosizione();
	}
	
	//---------------------------------------------------------------------------------------------
	
	public void interrompiThread()
	{
		interrotto = true;
	}
	
	//---------------------------------------------------------------------------------------------
	
	public void run()
	{
		corri();
	}
	
	//---------------------------------------------------------------------------------------------
	
	private void corri()
	{
		while(!interrotto)
		{
			cavallo.setPosizione(cavallo.getPosizione() + Config.getInstanza().getIncrementoCorsa());
			pause(((int)(1 + Math.random() * 2)) * cavallo.getHandicap());
		}	
		this.interrupt();
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
			Thread.currentThread().interrupt();
            return;
		}
	}
}
