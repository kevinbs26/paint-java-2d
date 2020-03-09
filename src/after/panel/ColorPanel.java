package after.panel;

import java.awt.GridLayout;

import javax.swing.JPanel;

import after.button.BlackButton;
import after.button.BlueButton;
import after.button.GreenButton;
import after.button.RedButton;

public class ColorPanel extends MyPanel {
	
	public BlackButton blackButton;
	public RedButton redButton;
	public GreenButton greenButton;
	public BlueButton blueButton;
	
	public ColorPanel() {
		// TODO Auto-generated constructor stub
		new JPanel();
		this.setLayout(new GridLayout(1,3));
		blackButton = new BlackButton();
		redButton = new RedButton();
		greenButton = new GreenButton();
		blueButton = new BlueButton();
		
		this.add(blackButton);
		this.add(redButton);
		this.add(greenButton);
		this.add(blueButton);
	}

}
