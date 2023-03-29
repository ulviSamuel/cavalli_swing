package it.volta.ts.ulivisamuel.cavalli_swing.business;

import java.util.List;

import it.volta.ts.ulivisamuel.cavalli_swing.bean.Gioco;
import it.volta.ts.ulivisamuel.cavalli_swing.main.Config;

public class GestoreGioco extends Thread
{
	private Gioco   gioco;
	private boolean interrotto;
	
	//---------------------------------------------------------------------------------------------
	
	public GestoreGioco()
	{
		this.setPriority(Thread.MAX_PRIORITY);
		gioco = new Gioco(Config.getInstanza().getPercInizCorsa(), Config.getInstanza().getPercFineCorsa());
		Config istanza = Config.getInstanza();
		istanza.getCavallo1().setPosizione(0);
		istanza.getCavallo2().setPosizione(0);
		istanza.getCavallo3().setPosizione(0);
		istanza.getCavallo4().setPosizione(0);
		gioco.addFantino(new Fantino(istanza.getCavallo1()));
		gioco.addFantino(new Fantino(istanza.getCavallo2()));
		gioco.addFantino(new Fantino(istanza.getCavallo3()));
		gioco.addFantino(new Fantino(istanza.getCavallo4()));
		interrotto = false;
	}
	
	//---------------------------------------------------------------------------------------------
	
	public void interrompiThread()
	{
		interrotto = true;
		fermaCavalli(gioco.getFantini());
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
		while(!interrotto)
		{
			fantini = gioco.getFantini();
			for(Fantino fantino : fantini)
			{
				if(fantino.getPosizione() >= gioco.getPercPosArrivo())
				{
					interrotto = true;
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
			Thread.currentThread().interrupt();
            return;
		}
	}
	
	//---------------------------------------------------------------------------------------------
	
	private void fermaCavalli(List<Fantino> fantini)
	{
		for(Fantino fantino : fantini)
			fantino.interrompiThread();
		this.interrupt();
	}
}
