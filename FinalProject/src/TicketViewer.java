//Mirzet Dolic
import java.awt.BorderLayout;
import java.awt.Rectangle;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class TicketViewer {

	public static void main(String[] args) {
	
		
		
		TicketCounter b = new TicketCounter(75);
		JFrame frame = new TicketCounterFrame(b);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		

	};

}
