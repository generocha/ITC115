
public class TicketMain {

	public static void main(String[] args) {
		
		Ticket ticket1 = new WalkUpTicket(300,50);
		// should print Number: 300, Price: $50.00.
		
		//Ticket ticket1 = new AdvanceTicket(98,50, 11);
		// 11 days in advanced will reduce the ticket price to $30.00
		// this should print Number: 98, Price: $30.00.
		
		//Ticket ticket1 = new AdvanceTicket(123,50, 3);
		// 3 days in advanced will reduce the ticket price to $40.00
		//Number: 123, Price: $40.00.
		
		//Ticket ticket1 = new AdvanceTicket(24,50, 0);
		// 0 days in advanced will not reduce the ticket price
		// Number: 24, Price: $50.00.
		
		System.out.println(ticket1.getTicketPrice());
		System.out.println(ticket1.getTicketNumber());
		System.out.println(ticket1.toString());

	}

}
