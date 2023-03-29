package it.volta.ts.ulivisamuel.cavalli_swing.business;

import java.util.List;

import it.volta.ts.ulivisamuel.cavalli_swing.bean.Gioco;
import it.volta.ts.ulivisamuel.cavalli_swing.main.Config;

public class GestoreGioco extends Thread
{
	private Gioco gioco;
	
	//---------------------------------------------------------------------------------------------
	
	public GestoreGioco()
	{
		this.setPriority(Thread.MAX_PRIORITY);
		gioco = new Gioco(Config.getInstanza().getPercInizCorsa(), Config.getInstanza().getPercFineCorsa());
		gioco.addFantino(new Fantino(Config.getInstanza().getCavallo1()));
		gioco.addFantino(new Fantino(Config.getInstanza().getCavallo2()));
		gioco.addFantino(new Fantino(Config.getInstanza().getCavallo3()));
		gioco.addFantino(new Fantino(Config.getInstanza().getCavallo4()));
	}
	
	//---------------------------------------------------------------------------------------------
	
	public void run()
	{
		List<Fantino> fantini = gioco.getFantini();
		avviaGara(fantini);
		verificaVincita(fantini);
	}
	
	//---------------------------------------------------------------------------------------------
	
	private void avviaGara(List<Fantino> fantini)
	{
		for(Fantino fantino : fantini)
			fantino.start();
	}
	
	//---------------------------------------------------------------------------------------------
	
	private void verificaVincita(List<Fantino> fantini)
	{
		boolean vincitoreTrovato = false;
		while(!vincitoreTrovato)
		{
			fantini = gioco.getFantini();
			for(Fantino fantino : fantini)
			{
				if(fantino.getPosizione() >= gioco.getPercPosArrivo())
				{
					vincitoreTrovato = true;
					fermaCavalli(fantini);
				}
			}
			pause(100);
		}
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
	
	//---------------------------------------------------------------------------------------------
	
	private void fermaCavalli(List<Fantino> fantini)
	{
		for(Fantino fantino : fantini)
			fantino.stop();
		this.stop();
	}
}
