//Mirzet Dolic
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TicketCounterFrame extends JFrame {
	final int FIELD_WIDTH = 10;
	private static final int RECT_WIDTH =100;
	private static final int  RECT_HEIGHT = 40;
	private  rectComponent rect;

	
	TicketCounter ticket;
	private JLabel statement = new JLabel("Enter how many tickets you'd like to purchase (1-6)");
	private JTextField ticketField = new JTextField(FIELD_WIDTH);
	private JButton purchaseTickets = new JButton("Purchase Tickets");
	private JLabel ticketBalance = new JLabel();
	private JLabel exception = new JLabel();
	private JLabel soldout = new JLabel();


	public TicketCounterFrame(TicketCounter b) {

		ticket = b;
		rect = new rectComponent();
		rect.setPreferredSize(new Dimension(RECT_WIDTH,RECT_HEIGHT));
		
		purchaseTicketsListener d = new purchaseTicketsListener();
		purchaseTickets.addActionListener(d);

		JPanel controlPanel = new JPanel();
		controlPanel.add(statement);
		controlPanel.add(ticketField);
		controlPanel.add(purchaseTickets);
		controlPanel.add(ticketBalance);
		controlPanel.add(exception);
		controlPanel.add(soldout);
		
		controlPanel.add(rect);

		add(controlPanel);
		setSize(600, 300);

	}

	class purchaseTicketsListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {

			String a = ticketField.getText();
			try {
				int purchaseTickets = Integer.parseInt(a);
				// Error handling for purchase amount & Error handling for remaining ticket amount
				if (purchaseTickets > 6 || purchaseTickets > ticket.getTicketBalance() || purchaseTickets < 1) {
					throw new NumberFormatException();
				}
				// calculation and reset of error handling from the exception
				int newTicketBalance = ticket.getTicketBalance() - purchaseTickets;
				ticket.setTicketBalance(newTicketBalance);
				ticketBalance.setText("Tickets Remaining: " + ticket.getTicketBalance());
				ticketField.setText("");
				exception.setText("");
				rect.setwidth(ticket.getTicketMax() - ticket.getTicketBalance());
				repaint();
				
			} catch (NumberFormatException erd) {
				exception.setText("Please enter a number, purchase ticket amount (1-6)");
			}
			//showing the ticket remaining balance
			finally {
				ticketBalance.setText("Tickets Remaining: " + ticket.getTicketBalance());
				ticketField.setText("");
				}
			}
		}
	}
	


