
public class EmployeeMain {

	public static void main(String[] args) {
		
		Janitor j1 = new Janitor();
		HarvardLawyer h1 = new HarvardLawyer();
		
		System.out.println("Janitor");
		System.out.println(j1.getHours());
		System.out.println(j1.getSalary());
		System.out.println(j1.getVacationDays());
		System.out.println(j1.clean());
		System.out.println();
		System.out.println("Harvard Lawyer");
		System.out.println(h1.getHours());
		System.out.println(h1.getVacationDays());
		System.out.println(h1.getVacationForm());
	}

}
