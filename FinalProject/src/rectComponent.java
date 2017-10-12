//Mirzet Dolic
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JComponent;
import javax.swing.JPanel;

public class rectComponent extends JComponent {
	private int width;
	public void setwidth( int w){
		this.width = w;
	}
	
	  public void paintComponent(Graphics g)
	  {
		 
	    // Drawing instructions go here
		  g.setColor(Color.BLUE);
		  g.drawRect(0, 10, 75, 20);
		  g.fillRect(0, 10,width, 20);

		 
	  }
	}
