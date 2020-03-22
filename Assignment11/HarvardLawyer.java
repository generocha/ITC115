
public class HarvardLawyer extends Lawyer{
	//**************************************
	//
	// The Class: HarvardLawyer
	// Extends the Lawyer class
	//
	// By:  Gene Rocha 
	// Date: 03/22/2020
	//
	//**************************************
	
	// Harvard lawyers are like normal lawyers, 
	//but they make 20% more money than a normal lawyer
	
	public double getSalary() {
		return super.getSalary() *  1.20;
	}
	
	// Harvard lawyers they get 3 days more vacation
	
	public int getVacationDays() {
		return super.getVacationDays() + 3;
	}
	// Harvard lawyers have to fill out four of the lawyer's 
	// forms to go on vacation
    public String getVacationForm() {
        String formColor = "";
        for(int i = 0; i < 4; i++) {
        	formColor += super.getVacationForm();
        }
        
		return formColor;
        
    }

}
