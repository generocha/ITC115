import java.text.NumberFormat;

public class WalkUpTicket extends Ticket{
	//**************************************
	//
	// The Class: WalkUpTicket
	//
	// By:  Gene Rocha 
	// Date: 03/15/2020
	//
	//**************************************
	
	
	// fields
	private int ticketNumber = 0;
	private double ticketPrice;
	
	// constructor
	
	public WalkUpTicket(int ticketNumber, double ticketPrice) {
		this.ticketNumber = ticketNumber;
		this.ticketPrice = ticketPrice;
	}
	
	
	// format the ticket price
	public String getPriceFormatted(double ticketPrice) {
		
        String formattedPrice = NumberFormat.getCurrencyInstance().format(this.ticketPrice);
        return formattedPrice;
		
	}
	// getters
	public int getTicketNumber() {
		return ticketNumber;
	}

	public double getTicketPrice() {
		return ticketPrice;
	}
	
	public void setTicketNumber(int ticketNumber) {
		this.ticketNumber = ticketNumber;
	}
	// setters
	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	
	@Override
    public String toString() {
        return "Number: " + ticketNumber + ", Price: "+ getPriceFormatted(ticketPrice) + ".";
    }
	
}
