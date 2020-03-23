public class Magazine extends LibraryItem{
	
	// fields
	private int itemNumber = 0;
	
	private String title;
	
	private String reserved;
	
	private String checkedIn;
	
	private int daysLate;
	
	double fines = 0.0;
	
	// constructor
	
	public Magazine(int itemNumber, String title, String reserved, String checkedIn, int daysLate) {
		this.itemNumber = itemNumber;
		this.title = title;
		this.reserved = reserved;
		this.checkedIn = checkedIn;
		this.daysLate = daysLate;
		this.fines = daysLate * .50;
	}

	@Override
	public int getItemNumber() {
		return itemNumber;
	}
	@Override
	public String title() {
		return title;
	}
	@Override
	public String getReserved() {
		return reserved;
	}
	@Override
	public String getCheckedIn() {
		return checkedIn;
	}
	@Override
	public int getDaysLate() {
		return daysLate;
	}
	@Override
	public double geFinesAccrued() {
		return fines = daysLate * 50;
	}
	@Override
    public String toString() {
		return "Library Item Number: #" +  itemNumber + ", Title: " + title + ", Reserved: " 
    + reserved + ", Checked In: " + checkedIn + ", Days Late: " + daysLate + ", Fines Accrued: $" + fines + " ";
    }
}
