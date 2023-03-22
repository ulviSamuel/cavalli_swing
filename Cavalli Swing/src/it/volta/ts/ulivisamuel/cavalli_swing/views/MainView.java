package it.volta.ts.ulivisamuel.cavalli_swing.views;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class MainView extends JFrame
{
	private JPanel mainPanel;
	private JPanel centerPanel;
	private JPanel footerPanel;
	
	//---------------------------------------------------------------------------------------------
	
	public MainView()
	{
		super();
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setIconImage(Toolkit.getDefaultToolkit().getImage("img\\logo.jpg"));
		formatCenterPanel();
		formatFooterPanel();
		formatMainPanel();
		this.add(mainPanel);
		this.pack();
	}
	
	//---------------------------------------------------------------------------------------------
	
	private void formatMainPanel()
	{
		mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());
		mainPanel.add(centerPanel, BorderLayout.CENTER);
		mainPanel.add(footerPanel, BorderLayout.SOUTH);
	}
	
	//---------------------------------------------------------------------------------------------
	
	private void formatCenterPanel()
	{
		centerPanel = new JPanel();
		centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));
		centerPanel.add(new CorsiaView(new ImageIcon("img\\cavalloN1.png")));
		centerPanel.add(new CorsiaView(new ImageIcon("img\\cavalloN2.png")));
		centerPanel.add(new CorsiaView(new ImageIcon("img\\cavalloN3.png")));
		centerPanel.add(new CorsiaView(new ImageIcon("img\\cavalloN4.png")));
	}
	
	//---------------------------------------------------------------------------------------------
	
	private void formatFooterPanel()
	{
		footerPanel = new JPanel();
		footerPanel.setLayout(new BorderLayout());
		JButton button = new JButton("Gioca");
		button.setPreferredSize(new Dimension(100, 50));
		footerPanel.add(button, BorderLayout.EAST);
	}
}
