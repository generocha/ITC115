public class Janitor extends Employee {
	//**************************************
	//
	// The Class: Janitor
	// Extends the Employee superclass
	//
	// By:  Gene Rocha 
	// Date: 03/22/2020
	//
	//**************************************
	
	// Janitors work twice as many hours per week as other employees (80 hours/week)
	public int getHours() {
		return super.getHours() * 2;
	}
	// Janitors make $30,000 ($10,000 less than general employees)
	public double getSalary() {
		return super.getSalary() - 10000;
	}
	// Janitors get half as much vacation as other employees (only 5 days)
	public int getVacationDays() {
		return super.getVacationDays() / 2;
	}
	public void clean() {
		System.out.println("Workin' for the man.");
	}

}
