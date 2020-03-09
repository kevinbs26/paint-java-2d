package after.panel;

import java.awt.GridLayout;

import after.button.ClearButton;

public class LeftPanel extends MyPanel{
	
	public ClearButton clearButton;
	public ColorPanel colorPanel;
	
	public LeftPanel() {
		initial();
		this.setLayout(new GridLayout(16,1));
		this.add(colorPanel);
		this.add(clearButton);
	}
	
	private void initial(){
		clearButton = new ClearButton();
		colorPanel = new ColorPanel();
	}

}
