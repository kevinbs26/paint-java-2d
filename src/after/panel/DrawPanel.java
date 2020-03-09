package after.panel;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JComponent;

public class DrawPanel extends JComponent{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Image image;
	private Graphics2D g2;
	private Coordinate coor;
	
	public DrawPanel(){
		Initial();
		
		addMouseListener(new MouseAdapter() {

			@Override
			public void mousePressed(MouseEvent e) {
				coor.setOldX(e.getX());
				coor.setOldY(e.getY());
			}
			
		});
		
		addMouseMotionListener(new MouseMotionAdapter() {

			@Override
			public void mouseDragged(MouseEvent e) {
				coor.setCurrentX(e.getX());
				coor.setCurrentY(e.getY());
				
				pencil();
			}
			
			
		});
			
	}
	
	private void Initial() {
		// TODO Auto-generated method stub
		coor = new Coordinate();
		this.setBackground(Color.WHITE);
		setDoubleBuffered(false);
	}

	protected void paintComponent(Graphics g){
		if (image == null){
			image = createImage(getSize().width, getSize().height);
			g2 = (Graphics2D) image.getGraphics();
			g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
			clear();
		}
		
		g.drawImage(image, 0, 0, null);
		
	}
	
	public void clear(){
		g2.setPaint(Color.WHITE);
		g2.fillRect(0, 0, getSize().width, getSize().height);
		g2.setPaint(Color.BLACK);
		repaint();
	}
	
	public void red(){
		g2.setPaint(Color.RED);
		
	}
	
	public void green(){
		g2.setPaint(Color.GREEN);
		
	}
	
	public void blue(){
		g2.setPaint(Color.BLUE);
		
	}
	
	public void black(){
		g2.setPaint(Color.BLACK);
		
	}
	
	public void pencil(){
		if(g2 != null){
			g2.drawLine(coor.getOldX(), coor.getOldY(), coor.getCurrentX(), coor.getCurrentY());
			repaint();
			coor.setOldX(coor.getCurrentX());
			coor.setOldY(coor.getCurrentY());
		}
	}

}
