package before;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Frame extends JFrame implements ActionListener {
	JPanel left,pnlcolor;
	JButton pencil;
	JButton red,green,blue,black,clear;
	DrawArea drawArea;
	
	int x, y, prevX, prevY;
	
	static int length= 1200 ,width= 800;
	
	public Frame() {
		setSize(length,width);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Paint");
		
		initial();
		
		setVisible(true);
	}

	private void initial() {
		drawArea = new DrawArea();
		left = new JPanel();
		pnlcolor = new JPanel();
		 add(left,BorderLayout.WEST);
		 add(drawArea,BorderLayout.CENTER);
		
		pnlcolor.setLayout(new GridLayout(1,3));
		red = new JButton();
		green = new JButton();
		blue = new JButton();
		black = new JButton();
		red.setBackground(Color.RED);
		green.setBackground(Color.GREEN);
		blue.setBackground(Color.BLUE);
		black.setBackground(Color.BLACK);
		pnlcolor.add(black);
		pnlcolor.add(red);
		pnlcolor.add(green);
		pnlcolor.add(blue);
		 
		pencil = new JButton("pencil");
		clear = new JButton("clear");
		
		 left.setLayout(new GridLayout(16,1));
		 left.add(pencil);
		 left.add(pnlcolor);
		 left.add(clear);
		 
		 drawArea.setBackground(Color.WHITE);
		 
		 red.addActionListener(this);
         green.addActionListener(this);
         blue.addActionListener(this);
         black.addActionListener(this);
         clear.addActionListener(this);
         pencil.addActionListener(this);
		 
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == clear){
			drawArea.clear();
		}
		if(e.getSource() == red){
			drawArea.red();
		}
		if(e.getSource() == green){
			drawArea.green();
		}
		if(e.getSource() == blue){
			drawArea.blue();
		}
		if(e.getSource() == black){
			drawArea.black();
		}
		if(e.getSource() == pencil){
			Main.flag = 0;
		}

	}
	
}
