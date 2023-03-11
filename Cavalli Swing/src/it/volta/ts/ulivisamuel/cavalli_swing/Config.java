package it.volta.ts.ulivisamuel.cavalli_swing;

import javax.swing.ImageIcon;

public class Config 
{
	private static Config    istanza         = null;
	private        ImageIcon track           = new ImageIcon("img\\track.png");
	private        ImageIcon cavallo1Img     = new ImageIcon("img\\cavalloN1.png");
	private        ImageIcon cavallo2Img     = new ImageIcon("img\\cavalloN2.png");
	private        ImageIcon cavallo3Img     = new ImageIcon("img\\cavalloN3.png");
	private        ImageIcon cavallo4Img     = new ImageIcon("img\\cavalloN4.png");
	private        String    scrittaBtnGioca = "Gioca";
	private        String    logo            = "img\\logo.jpg";
	
	
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

	public String getLogo() 
	{
		return logo;
	}

	public ImageIcon getTrack()
	{
		return track;
	}

	public ImageIcon getCavallo1Img() 
	{
		return cavallo1Img;
	}

	public ImageIcon getCavallo2Img()
	{
		return cavallo2Img;
	}

	public ImageIcon getCavallo3Img()
	{
		return cavallo3Img;
	}

	public ImageIcon getCavallo4Img() 
	{
		return cavallo4Img;
	}

	public String getScrittaBtnGioca()
	{
		return scrittaBtnGioca;
	}

	
	
	public void setLogo(String logo) 
	{
		this.logo = logo;
	}

	public void setTrack(ImageIcon track) 
	{
		this.track = track;
	}

	public void setCavallo1Img(ImageIcon cavallo1Img)
	{
		this.cavallo1Img = cavallo1Img;
	}

	public void setCavallo2Img(ImageIcon cavallo2Img) 
	{
		this.cavallo2Img = cavallo2Img;
	}

	public void setCavallo3Img(ImageIcon cavallo3Img)
	{
		this.cavallo3Img = cavallo3Img;
	}

	public void setCavallo4Img(ImageIcon cavallo4Img) 
	{
		this.cavallo4Img = cavallo4Img;
	}

	public void setScrittaBtnGioca(String scrittaBtnGioca)
	{
		this.scrittaBtnGioca = scrittaBtnGioca;
	}
}
