
public class TicketCounter {
	//Mirzet Dolic

private int ticketBalance;
private int ticketMax;

public TicketCounter(int t){
	setTicketMax(t);
	setTicketBalance(t);
}

private void setTicketMax(int t) {
	this.ticketMax = t;
	
}
public int getTicketMax(){
	return ticketMax;
}

public int getTicketBalance() {
	return ticketBalance;
}

public void setTicketBalance(int ticketBalance) {
	this.ticketBalance = ticketBalance;
}
public int purchaseTickets(int amount){
	int purchaseTickets = amount;
	return purchaseTickets;


}
}