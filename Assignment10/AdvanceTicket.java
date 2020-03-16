import java.text.NumberFormat;

public class AdvanceTicket extends Ticket{
	//**************************************
	//
	// The Class: AdvanceTicket
	// Tickets purchased 10 days in advance are reduced by $20.00
	// Tickets purchased less than 10 days in advance but more than 0 days are reduced by $10.00
	//
	// By:  Gene Rocha 
	// Date: 03/15/2020
	//
	//**************************************
	
	// fields
	private int ticketNumber = 0;
	private double ticketPrice;
	private int numberOfDays = 0;
	
	// constructor
	
	public AdvanceTicket(int ticketNumber, double ticketPrice, int numberOfDays) {
		this.ticketNumber = ticketNumber;
		this.ticketPrice = ticketPrice;
		this.numberOfDays = numberOfDays;
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

	public int getNumberOfDays() {
		return numberOfDays;
	}

	public double getTicketPrice() {
		if(numberOfDays > 10) {
			// ticket price $30.00
			ticketPrice = ticketPrice - 20;
		}else if(numberOfDays < 10 && numberOfDays > 0)
			// ticket price $40.00
			ticketPrice = ticketPrice - 10;
		return ticketPrice;
	}
	
	// setters
	public void setTicketNumber(int ticketNumber) {
		this.ticketNumber = ticketNumber;
	}
	
	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public void setNumberOfDays(int numberOfDays) {
		this.numberOfDays = numberOfDays;
	}
	
	@Override
    public String toString() {
        return "Number: " + ticketNumber + ", Price: "+ getPriceFormatted(ticketPrice) + ".";
    }

}
