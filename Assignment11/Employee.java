//represent employees in general
public class Employee {
    public void applyForVacation() {
        System.out.println("Use the yellow form.");
    }
    
    public double setSalary() {
    	return 40000.00;
    }
    public int setHours() {
    	return 40;
    }
    public int setVacationDays() {
    	return 10;
    }
    
    public double getSalary() {
		return setSalary();
	}
    public int getHours() {
		return setHours();
	}
    public int getVacationDays() {
		return setVacationDays();
	}

}
