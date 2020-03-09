package after.button;

import java.awt.Color;

import javax.swing.JButton;

public abstract class MyButton extends JButton {


	protected static final Color RED = Color.RED;
	protected static final Color GREEN = Color.GREEN;
	protected static final Color BLUE = Color.BLUE;
	protected static final Color BLACK = Color.BLACK;
	
	public MyButton() {
	}
	
	protected abstract void setColor();
	protected abstract void setText();

}
