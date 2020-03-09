package after.frame;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import after.panel.DrawPanel;
import after.panel.LeftPanel;

public class MyFrame extends JFrame implements ActionListener{
	
	protected static final int LENGTH= 1200 ,WIDTH= 800;
	protected static final String TITLE = "Paint";
	
	LeftPanel lp;
	DrawPanel dp;
	
	public MyFrame() {
		initial();
		frameController();
	}

	private void frameController() {
		setSize(LENGTH,WIDTH);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle(TITLE);		
		setVisible(true);
	}
	
	private void initial(){
		lp = new LeftPanel();
		dp = new DrawPanel();
		add(lp, BorderLayout.WEST);
		add(dp, BorderLayout.CENTER);
		lp.clearButton.addActionListener(this);
		lp.colorPanel.blackButton.addActionListener(this);
		lp.colorPanel.redButton.addActionListener(this);
		lp.colorPanel.greenButton.addActionListener(this);
		lp.colorPanel.blueButton.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == lp.clearButton){
			dp.clear();
		}
		if(e.getSource() == lp.colorPanel.redButton){
			dp.red();
		}
		if(e.getSource() == lp.colorPanel.greenButton){
			dp.green();
		}
		if(e.getSource() == lp.colorPanel.blueButton){
			dp.blue();
		}
		if(e.getSource() == lp.colorPanel.blackButton){
			dp.black();
		}
	}

}
